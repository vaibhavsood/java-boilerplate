public class ThreadBasics {
  public static class TestThread extends Thread {
    public void run() {
      for (int i = 0; i < 5; i++) {
        System.out.println("This print is from thread: " + Thread.currentThread().getName());
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }  
  }
  
  public static void main(String[] args) {
      //Thread.currentThread().setPriority(1);

      TestThread t1 = new TestThread();
      TestThread t2 = new TestThread();
    
      t1.setPriority(1);
    
      System.out.println("priority:" + Thread.currentThread().getPriority());
    
      t1.start();
      //t2.start();
    
      /*try {
        t1.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }*/
    
      /*System.out.println("Main thread priority:" + Thread.currentThread().getPriority());
      System.out.println("t1 thread priority:" + t1.getPriority());
      System.out.println("t2 thread priority:" + t2.getPriority());*/
    
      for (int i = 0; i < 5; i++) {
        Thread.yield();
        System.out.println("This print is from thread: " + Thread.currentThread().getName());
      }
  }
}