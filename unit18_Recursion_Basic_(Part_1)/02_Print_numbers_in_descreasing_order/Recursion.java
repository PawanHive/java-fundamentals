// RECURSION: Print numbers in decreasing (from n to 1)

import java.util.*;

public class Recursion {
  public static void printDec(int n) {
    if (n == 1) { // base case
      System.out.println(n);
      return;
    }
    System.out.print(n + " ");
    printDec(n - 1); // recursive function
  }
  public static void main(String[] args) {
    int n = 10;
    printDec(n); // output: 10 9 8 7 6 5 4 3 2 1
  }
}
