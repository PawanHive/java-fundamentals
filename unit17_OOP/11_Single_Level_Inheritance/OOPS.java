
public class OOPS {
  public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
  }
}

// Exmpale of: SINGLE LEVEL INHERITANCE
// BASE (parent) class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breath() {
    System.out.println("breathes");
  }
}

// DERIVED (child) class / subclass
class Fish extends Animal {
  int fins;

  void swim() {
    System.out.println("Swims in water");
  }
}