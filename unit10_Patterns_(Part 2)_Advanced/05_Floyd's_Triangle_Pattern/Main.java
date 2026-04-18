

public class Main {

  public static void floyds_triangle(int n) {
    int counter = 1;

    // outer loop - decides no. of rows in a pattern
    for (int i = 1; i <= n; i++) {
      // inner loop - print no. as counter (increasing order)
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      
      System.out.println();
    }
  }
  public static void main(String[] args) {
    floyds_triangle(5);
  }
}
