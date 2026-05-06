import java.util.*;

public class Recursion {
  public static int optimizedPower(int a, int n) { // O(logn)
    if(n == 0) { // basecase
      return 1;
    }
    
    int halfPower = optimizedPower(a, n/2); // recursive function
    int halfPowerSq = halfPower * halfPower;

    // if n is odd
    if (n % 2 != 0) {
      halfPowerSq = a * halfPowerSq;
    }

    return halfPowerSq;
  }
  public static void main(String[] args) {
    int a = 2;
    int n = 5;
    System.out.println(optimizedPower(a, n)); // a to the power n = 32
  }
}
