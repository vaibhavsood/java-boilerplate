class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Man extends Person {
  Man(String name, int age) {
    super(name, age);
  }  
}

public class Inheritance {
  public static void main(String[] args) {
    //Person p = new Person();
    Man m = new Man("Vaibhav", 31);
  }
}