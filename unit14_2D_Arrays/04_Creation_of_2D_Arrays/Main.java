import java.util.*;

public class Main {

  // Search key from matrix
  public static boolean searchMatrix (int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++ ) {
        if (matrix[i][j] == key) { // comparing key to matrix value
          System.out.print("found at cell (" + i +"," + j + ")");
          return true; // if true, then stop further execution
        }
      }
    }
    System.out.println("Key not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;

    Scanner sc = new Scanner(System.in);

    // Create Matrix:
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt(); // taking from user input
      }
    };

    // print output:
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " "); // give output
      }
      System.out.println(); // next line
    }

    searchMatrix(matrix, 9);
  }

}