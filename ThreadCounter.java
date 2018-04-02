import java.util.concurrent.locks.*;

public class ThreadCounter {
  static int counter = 0;
  static ReentrantLock lock = new ReentrantLock();
  
  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new Runnable() {
      public void run() {
       lock.lock();
       for (int i = 0; i < 5; i++) {
        System.out.println("increment from thread1..");
        counter++;
       }
       lock.unlock();
      }
    });
    
    Thread t2 = new Thread(new Runnable() {
      public void run() {
       lock.lock();
       for (int i = 0; i < 5; i++) {
        System.out.println("increment from thread2.."); 
        counter++;
       }
       lock.unlock();
      }
    });

    t1.start();
    t2.start();
    
    t1.join();
    t2.join();
    
    System.out.println("Counter:" + counter);
  }
}