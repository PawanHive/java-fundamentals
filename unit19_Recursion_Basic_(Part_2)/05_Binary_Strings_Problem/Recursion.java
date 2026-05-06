

public class Recursion {
  public static void printBinString(int n, int lastPlace, String str) {
    // base case
    if(n ==0) {
      System.out.println(str); // print the generated string
      return;
    }

    // Move to next position (n-1), lastPlace becomes 0
    printBinString(n-1, 0, str+"0");

    // This avoids consecutive 1s (i.e., "11")
    if(lastPlace == 0) {
      printBinString(n-1, 1, str+"1");
    }
  }
  public static void main(String[] args) {
    printBinString(3, 0, ""); // here n means length of binary string
  }
}
