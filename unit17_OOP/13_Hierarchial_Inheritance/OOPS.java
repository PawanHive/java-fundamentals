
public class OOPS {
  public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
    shark.swim();
  }
}

// Exmpale of: HIERARCHIAL INHERITANCE
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

// (CHILD 1) class
class Mammal extends Animal {
  void walk() {
    System.out.println("walks");
  }
}

// (CHILD 2) class
class Fish extends Animal {
  void swim() {
    System.out.println("swims");
  }
}

// (CHILD 2) class
class Bird extends Animal {
  void fly() {
    System.out.println("flys");
  }
}
