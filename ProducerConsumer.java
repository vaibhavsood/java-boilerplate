  class Producer implements Runnable {
    public void run() {
      synchronized(pcq) {
        try {
          if (pcq.start == 0 && pcq.end == 4 || pcq.start == pcq.end+1)
            wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        pcq.end = 8;
        pcq.end++;
        pcq.end %= 5;
        System.out.println("Producer: produced a value!");
        notify();
      }
    }  
  }

  class Consumer implements Runnable {
    public void run() {
      synchronized(pcq) {
        try {
          if (pcq.start == pcq.end)
            wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        System.out.println("Consumer: consumed a value!  " + pcq.queue[pcq.start]);
        pcq.start++;
        pcq.start %= 5;
        notify();
      }
    }  
  }

public class ProducerConsumer {
  public class PCQueue {
    int[] queue;
    int start;
    int end;
  }
  
  PCQueue pcq;
  
  ProducerConsumer() {
    pcq = new PCQueue();
    pcq.queue = new int[5];
    pcq.start = 0;
    pcq.end = 0;
  }
  
  public static void main(String[] args) {
    Producer p = new Producer();
    Consumer c = new Consumer();
    
    Thread producer = new Thread(p);
    Thread consumer = new Thread(c);
    
    producer.start();
    consumer.start();
  }
}