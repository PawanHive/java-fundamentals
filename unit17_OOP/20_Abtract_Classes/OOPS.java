import java.util.*;

public class OOPS {
  public static void main(String[] args) {

    Mustang myHorse = new Mustang(); // Hierarchy for this OBJECT: Animal -> Horse -> -> Mustang ..... it will call CONSTRUCTOR one after another.


    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color); // child's always first call to parent CONSTRUCTOR method

    // Chicken c = new Chicken();
    // c.eat();
    // c.walk();

    // Animal a = new Animal();  // Error: "Cannot instantiate the type Animal"  ... because it is a ABSTRACT class, so we can't create OBJECT of it.
  }
}

// -----------------------------------------  BASE class ------------------------------------------------
// ABSTRACT class
abstract class Animal { 

  String color;

  // CONSTRUCTOR method of this 'Animal' class
  Animal() { // if class and method name matches exactly same means it is CONSTRUCTOR method.
    System.out.println("Animal constructor called");
    // color = "brown";
  }

  void eat() {
    System.out.println("animal eats");
  }

  // ABSTRACT functions
  abstract void walk(); // we don't implementation part (curly braces part) of functions, when we have to declare it ABSTRACT.
}

// ---------------------------------------------- 1st CHILD class ---------------------------------
class Horse extends Animal {
  // CONSTRUCTOR of 'Horse' class
  Horse() {
    System.out.println("Horse constructor called");
  }

  void changeColor() {
    color = "dark brown";
  }

  void walk () {
    System.err.println("walks on 4 legs");
  }
}

// grandChild of 1st CHILD class
class Mustang extends Horse {
  // CONSTRUCTOR of 'Horse' class
  Mustang() {
    System.out.println("Mustang constructor called");
  }
}

// ---------------------------------------------- 2nd CHILD class -----------------------------------
class Chicken extends Animal {
  void changeColor() {
    color = "yellow";
  }
  void walk() {
    System.out.println("walks on 2 legs");
  }
}

/*
Note: How abstract being useful here

same functions used according to different kind of animals
same walk() functions tell something different about 'Horse' and something different about 'Chicken'
 */