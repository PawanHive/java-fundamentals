

public class Main {

  public static void butterfly(int n) {
    // 1st half 
    for (int i = 1; i <= n; i++) {
      // STARS - (i)
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // SPACES - 2*(n-i)
      for (int j = 1; j <= 2*(n-i); j++) {
        System.out.print(" ");
      }

      // STARS - (i)
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
    
    // 2nd half
    for (int i = n; i >= 1; i--) {
      // STARS - (i)
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // SPACES - 2*(n-i)
      for (int j = 1; j <= 2*(n-i); j++) {
        System.out.print(" ");
      }

      // STARS - (i)
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
  public static void main(String[] args) {
    butterfly(4);
  }
}
