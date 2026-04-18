

public class Main {

  public static void inverted_half_pyramid_pattern(int n) {
    // outer loop - decide no. of rows
    for (int i = 1; i <= n; i++) {
      // inner loop - print no. from 1 to n-1+1 in a single row
      for (int j = 1; j <= n-i+1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    inverted_half_pyramid_pattern(5);
  }
}
