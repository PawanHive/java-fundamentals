// Searching matrix value using STAIRCASE search technique
  // this search start from (TOP-RIGHT CORNER)


public class Main {
  // // This is BRUTE FORCE way to searching value in matrix:
  // public static void searchMatrix(int matrix[][], int key) {
  //   for (int i = 0; i < matrix.length; i++) {
  //     for (int j = 0; j < matrix[0].length; j++) {
  //       if (matrix[i][j] == key) {
  //         System.out.println("Index of your key : (" + i + ", " + j + ")");
  //       }
  //     }
  //   }
  // }

  // Searching matrix value using STAIRCASE search technique
  // this search start from (TOP-RIGHT CORNER)
  public static boolean staircaseSearch(int matrix[][], int key) {
    int row = 0;  // represend row index 
    int col = matrix[0].length - 1; // represent column index (m -1) = (matrix[0].length -1)

    while (row < matrix.length && col >= 0) { // check you should inside matrix vertically(i < n) as well as horizontally(j >= 0)

      if (matrix[row][col] == key) {
        System.out.println("Found key at (" + row + ", " + col + ")");
        return true;
      }

      else if (key < matrix[row][col]) {
        col--;
      }
      else {
        row++;
      }
    }

    System.out.println("Key not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 }
    };
    int key = 33;

    staircaseSearch(matrix, key); // output: Found key at (3, 1)
  }

}