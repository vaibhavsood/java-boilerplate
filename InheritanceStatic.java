public class InheritanceStatic {
  static class First {
    int test = 0;
    static int first() {
      System.out.println("print from first!");
      return 0;
    }
  }
  
  static class Second extends First {
    int test = 1;
    static int first() {
      System.out.println("print from second!");
      return 0;
    }
  }
  
  public static void main(String[] args) {
    First s = new Second();
    s.first();
    System.out.println(s.test);
  }
}