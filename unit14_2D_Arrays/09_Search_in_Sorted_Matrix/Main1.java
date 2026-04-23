  // Searching matrix value using STAIRCASE search technique
  // this search start from (BOTTOM-LEFT CORNER)

public class Main1 {

  // Searching matrix value using STAIRCASE search technique
  // this search start from (BOTTOM-LEFT CORNER)
  public static boolean staircaseSearch(int matrix[][], int key) {
    int row = matrix.length - 1; // (n - 1)
    int col = 0;

    while (col < matrix[0].length && row >= 0) {

      if (matrix[row][col] == key) {
        System.out.println("Found key at : (" + row + ", " + col + ")");
        return true;
      }
      
      else if (key < matrix[row][col]) {
        row--;
      }
      else {
        col++;
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

    staircaseSearch(matrix, key); }
}
