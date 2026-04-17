
public class Main {
  // func to calc sum of 2 numbers
  public static int sum(int a, int b) {
    return a + b;
  }
  // func to calc sum of 3 numbers
  public static int sum(int a, int b, int c) {
    return a + b + c;
  }
  public static void main(String[] args) {
    System.out.println(sum(2, 4));
    System.out.println(sum(9, 8, 5));
  }
}
