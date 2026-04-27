import java.util.*;

public class Main {

  public static int clearIBit(int n, int i) { // clear all bits from 0 - i-1th index.
    int bitMask = (~0)<<i;
    return n & bitMask;
  }
  public static void main(String[] args) {
    System.out.println(clearIBit(15, 2));
  }
}