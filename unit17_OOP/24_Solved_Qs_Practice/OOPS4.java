public class OOPS4 {

  public static void main(String[] args) {
    Vehicles obj1 = new Car();
    obj1.print();

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
  void print() {
    System.out.println("Derived classCar");
  }
}