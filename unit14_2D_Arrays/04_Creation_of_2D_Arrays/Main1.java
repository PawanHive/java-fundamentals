// print largest element of matrix
import java.util.*;

public class Main1 {
  public static int printLargestElment(int matrix[][]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) 
        if (largest < matrix[i][j]) {
          largest = matrix[i][j];
        }
    }
    return largest;
  }
  public static void main(String[] args) {
    int matrix[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 71, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };
    System.out.println(printLargestElment(matrix));
  }
}
