import java.util.*;

public class Main {

  public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) != 0) { // check our LSB has 0 or 1, if LSB = 1, then count++ ..... (n & 1) is formula to find LSB.
        count++;
      }
      n = n >> 1; // right shifting n by 1 and then again storing new value into n
    }

    return count;
  }
  public static void main(String[] args) {
    System.out.println(countSetBits(15)); // output = 4 // because 15 = 1111, here 1s occur for 4times
    System.out.println(countSetBits(10)); // output = 2 // because 10 = 1010, here 1s occur for 2 tims
  }
}