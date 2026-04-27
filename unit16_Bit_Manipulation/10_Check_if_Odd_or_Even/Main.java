import java.util.*;

public class Main {

  public static void oddOrEven(int n) {
    int bitMask = 1;
    if ((n & bitMask) == 0) {
      // even number
      System.out.println(n + " number is even");
    } else {
      System.out.println(n + " number is odd");
    }
  }
  public static void main(String[] args) {
    oddOrEven(0);
    oddOrEven(11);
    oddOrEven(14);
  }
}