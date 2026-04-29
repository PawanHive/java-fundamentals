
public class OOPS {
  public static void main(String[] args) {
    Deer d = new Deer();
    d.eat(); // it will call child class's eat() function, we made OBJECT of Deer class
  }
}

// Exmpale of: SINGLE LEVEL INHERITANCE
// BASE (parent) class
class Animal {
  String color;

  void eat() {
    System.out.println("eats anything");
  }

  void breath() {
    System.out.println("breathes");
  }
}

// DERIVED (child) class / subclass
class Deer extends Animal {
  void eat() {
    System.out.println("eats grass");
  }
}