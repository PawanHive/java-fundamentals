
public class OOPS {
  public static void main(String[] args) {
    Horse h = new Horse();
    System.out.println(h.color);
  }
}

class Animal {

  String color;

  Animal() {
    System.out.println("animal constructor is called ");
  }
}

class Horse extends Animal {
  Horse() {
    super.color = "brown"; // will access parent class 'Animal' color properties
    // super(); //(super means immediate parent class) Animal class constructor will automatically called now, because super always helps us to acces parent's functions, properties and constructors
    System.out.println("horse constructor is called ");
  }
}

