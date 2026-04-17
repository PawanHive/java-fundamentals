

public class Main {

  public static int multiply(int a, int b) {
    int product = a * b;
    return product;
  }
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int prod = multiply(a, b);
    System.out.println("Product is = " + prod);

    prod = multiply(6, 7);
    System.out.println("Product is = " + prod);
  }
}
