
public class OOPS {
  public static void main(String[] args) {
    Dog doggy = new Dog();
    doggy.eat();

    doggy.legs = 4;
    System.out.println(doggy.legs);
  }
}

// Exmpale of: MULTI LEVEL INHERITANCE
// (Grandparent) class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breath() {
    System.out.println("breathes");
  }
}

// (Parent) class
class Mammal extends Animal {
  int legs; 
}

// (Child) class
class Dog extends Mammal {
  String breed;
}