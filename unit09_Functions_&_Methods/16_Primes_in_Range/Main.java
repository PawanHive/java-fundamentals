import java.util.*;

public class Main {

  // isPrime?
  public static boolean isPrime(int n) {
    // corner case 2
    if(n == 2) {
      return true;
    }
    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void primesInRange(int n) {
    for(int i = 2; i <= n; i++) {
      if(isPrime(i) == true) {
        System.out.print(i + " ");
      }
    }
  }
  public static void main(String[] args) {
    // System.out.println(isPrime(2));
    primesInRange(100); // range 2 to 100  (gives all prime no. between that) // output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

  }
}
