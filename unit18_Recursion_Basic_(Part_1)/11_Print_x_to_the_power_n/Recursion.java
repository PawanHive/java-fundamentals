// prit x to the power n

public class Recursion {
  public static int power(int x, int n) {
    if (n == 0) { // base case
      return 1;
    }

    // int xnm1 = power(x, n-1); // 'xnm1' = "x to the power n minus 1"
    // int xn = x * xnm1; // 'xn' = "x to the power n"
    // return xn;

    return x * power(x, n-1);
  }
  public static void main(String[] args) {
    System.out.println(power(2, 10)); // 2 to the power 10 = 1024
  }
}
