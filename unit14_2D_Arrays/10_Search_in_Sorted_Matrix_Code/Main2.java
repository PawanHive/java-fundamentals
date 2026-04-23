public class Main2 {

  public static void transposedMatrix(int matrix[][]) {
    int n = matrix.length; // row
    int m = matrix[0].length; // columns

    // transpose size is m * n
    int transpose[][] = new int[m][n];

    // build transpose
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    // print transpose matrix
      for (int i = 0; i < transpose.length; i++) {
        for (int j = 0; j < transpose[0].length; j++) {
          System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
      }
  }


  public static void main(String[] args) {
    int matrix[][] = {
      {1, 2, 3},
      {4, 5, 6}
    };
    transposedMatrix(matrix);
  }
}
