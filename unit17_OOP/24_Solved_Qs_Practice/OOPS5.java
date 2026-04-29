public class OOPS5 {

  public static void main(String[] args) {
    Vehicles obj1 = new Car();
    // obj1.print1(); // error

    Vehicles obj2 = new Vehicles();
    obj2.print();
  }
}

class Vehicles {
  void print () {
    System.out.println("Base classVehicle");
  }
}

class Car extends Vehicles {
  void print1() { // this is different function
    System.out.println("Derived classCar");
  }
}