
public class OOPS {
  public static void main(String[] args) {
    Fish shark = new Fish();
    shark.eat();
    shark.swim();

    Human people = new Human();
    people.gossip();

  }
}

// Exmpale of: HYBRID INHERITANCE
// BASE (GRANDPARENT) class
class Animal {
  String color;

  void eat() {
    System.out.println("eats");
  }

  void breath() {
    System.out.println("breathes");
  }
}

// ------------------------------------------------- PARENT (Mammal) class ---------------------------------
class Mammal extends Animal {
  void walk() {
    System.out.println("Mamal walks");
  }
}

// 1st CHILD of (Mammal)
class Dog extends Mammal {
  void bark() {
    System.out.println("Dogs usually bark");
  }
}

// 2nd CHILD of (Mammal)
class Cat extends Mammal {
  void meow() {
    System.out.println("Cat usually meow");
  }
}

// 3rd CHILD of (Mammal)
class Human extends Mammal {
  void gossip() {
    System.out.println("Human usually gossip");
  }
}

// ----------------------------------------------- PARENT (Fish) class -----------------------------------
class Fish extends Animal {
  void swim() {
    System.out.println("Fish swims");
  }
}

// 1st CHILD of (Fish)
class Whale extends Fish {
  void bigWhale() {
    System.out.println("Whales are big");
  }
}

// 2nd CHILD of (Fish)
class Shark extends Fish {
  void smartShark() {
    System.out.println("Sharks are smart");
  }
}

// ----------------------------------------------- PARENT (Bird) class --------------------------------
class Bird extends Animal {
  void fly() {
    System.out.println("Bird flies");
  }
}

// single CHILD of (Bird)
class Peacock extends Bird {
  void beautiful() {
    System.out.println("Peacocks are beautiful");
  }
}