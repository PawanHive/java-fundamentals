
public class Main {
  public static void main(String[] args) {
    
    // Type conversion (byte → short → char → int → long(8b) → float(4b) → double)

    int a = 10;
    double b = a;
    System.out.println(b);

    long l = 324;
    float f = l;
    System.out.println(f);



    // double c = 10;
    // int d = c;  // error: possible lossy conversion from double to int
    // System.out.println(d);

  }
}