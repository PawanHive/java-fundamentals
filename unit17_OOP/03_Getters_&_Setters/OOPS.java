
public class OOPS {

  public static void main(String[] args) {
    Pen p1 = new Pen(); // object created

    p1.setColor("Blue"); // value assign through 'setColor' method
    System.out.println(p1.getColor());  // value access through '.getColor()' method

    p1.setTip(5);
    System.out.println(p1.getTip());

    p1.setColor("Yellow");
    System.out.println(p1.getColor());
  }
}

class Pen {
  private String color;
  private  int tip;

  // GETTER functions
  String getColor() { 
    return this.color;  // here 'this.color' refers to the 'int color'.
  }

  int getTip() { 
    return this.tip; // here 'this.tip' refers to the 'int tip'.
  }

  // SETTER functions
  void setColor(String newColor) {
    this.color = newColor;
  }

  void setTip(int newTip) {
    this.tip = newTip;
  }
}