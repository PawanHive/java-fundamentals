import java.util.*;

public class Main {

  public static int setIthBit(int n, int i) { // ith position should = 1
    int bitMask = 1 << i;
    return n | bitMask;
  }

  public static int clearIthBit(int n, int i) { // ith position should = 0
    int bitMask = ~(1 << i);
    return n & bitMask;
  }

  // // Two Ways to Update-ith-Bit 
  // // METHOD 1 (Using if-else)
  // public static int updateIthBit(int n, int i, int newBit) {
  //   if (newBit == 0) {
  //     return clearIthBit(n, i);
  //   } else {
  //     return setIthBit(n, i);
  //   }
  // }

  // METHOD 2 (first clear i-th Bit, then set new value)
  public static int updateIthBit(int n, int i, int newBit) {
    n = n & ~(1 << i); // clear i-th bit
    int bitMask = newBit << i;  // newBit can have only two value 0, 1; if newBit = 1, then output will same equal to n, if newBit = 1, then it will set-ith-bit to 1;
    return n | bitMask;   // set new value
  }
  public static void main(String[] args) {
    System.out.println(updateIthBit(10, 2, 1)); // i-th bit position should be = newbit, means = 1
    System.out.println(updateIthBit(10, 2, 0)); // i-th bit position should be = newbit, means = 0
  }
}