
public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen();  // created a pen object called p1 .... here Pen() is a Constuctor
    
    p1.setColor("Blue"); // here we access 'setColor' functions from the Pen object and set 'newColor' as "Blue"
    System.out.println(p1.color);
    
    p1.setTip(5);
    System.out.println(p1.tip);
    
    p1.color = "Yellow";   // BAD PRACTICE // here we access property variable from the Pen object and set color directly to "Yellow"
    System.out.println(p1.color);
  }
}

// Our own created class should always below 'public class'

// Pen class
class Pen { // by convention class name always start with CAPITAL-LETTER

  // Pen properties
  String color;
  int tip;

  // some functions for Pen
  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}

// Student class
class Student {
  String name;
  int age;
  float percentage; 

  void calcPercentage( int phy, int chem, int math) {
    percentage = (phy + chem + math) / 3;
  }
}