import java.util.*;

public class Main {

  // Check no. is power of two or not.
  public static boolean isPowerOfTwo(int n) {
    return (n & (n - 1)) == 0;
  }
  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(16)); 
    System.out.println(isPowerOfTwo(10));
    System.out.println(isPowerOfTwo(4));
    System.out.println(isPowerOfTwo(1));
  }
}