

public class Main {

  public static void zero_one_triangl_pattern(int n) {
    // outer loop - decides no. row in pattern
    for (int i = 1; i <= n; i++) {
      // inner loop - print no. to columns of single row
      for (int j = 1; j <= i; j++) {
        // check sum of index - is even or odd
        if ((i+j) % 2 == 0) {
          System.out.print("1" + " ");
        } else {
          System.out.print("0" + " ");
        }
      }

      System.out.println();
    }
  }
  public static void main(String[] args) {
    zero_one_triangl_pattern(5);
  }
}
