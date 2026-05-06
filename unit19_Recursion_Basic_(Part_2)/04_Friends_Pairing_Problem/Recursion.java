import java.util.*;

public class Recursion {
  public static int friendsPairing(int n) {
    // base case
    if (n == 1 || n == 2) {
      return n;
    }

    // // choice single
    // int fnm1 = friendsPairing(n - 1);

    // // choice pair
    // int fnm2 = friendsPairing(n - 2);
    // int pairWays = (n - 1) * fnm2;

    // // totWays
    // int totWays = fnm1 + pairWays;
    // return totWays;

    // above code commented code written in single line:
    return friendsPairing(n-1) + (n - 1) * friendsPairing(n-2);
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(friendsPairing(n));
  }
}
