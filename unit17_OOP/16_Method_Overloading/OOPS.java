
public class OOPS {
  public static void main(String[] args) {
    Calculator calc = new Calculator(); // OBJECT created
    System.out.println(calc.sum(1, 2));
    System.out.println(calc.sum(1.5f, 2.5f));
    System.out.println(calc.sum(1, 2, 3));
  }
}

class Calculator {
  int sum(int a, int b) {  // int type
    return a + b;
  }

  float sum(float a, float b) { // float type
    return a + b;
  }

  int sum(int a, int b, int c) { // int type but with 3 parameter
    return a + b + c;
  }
}