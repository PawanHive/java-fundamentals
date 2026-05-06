

// WRONG approach to solve print increasing using recursion
// Not preferred because it increases the problem size (n → n+1) instead of reducing it, which breaks the standard recursion pattern

// public class Recursion {
//   public static void printInc(int n) {
//     if (n == 10) {
//       System.out.println(n);
//       return;
//     }
//     System.out.print(n + " ");
//     printInc(n + 1);
//   }
//   public static void main(String[] args) {
//     int n = 1;
//     printInc(n);
//   }
// }

// CORRECT approach to solve print increasing using recursion
public class Recursion {
  public static void printInc(int n) {
    if (n == 1) { // base case
      System.out.print(n + " ");
      return;
    }
    printInc(n - 1); // recursive function
    System.out.print(n + " ");
  }
  public static void main(String[] args) {
    int n = 10;
    printInc(n);
  }
}
