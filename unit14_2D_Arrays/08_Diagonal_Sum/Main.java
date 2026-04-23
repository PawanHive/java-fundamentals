

public class Main {
  
  // // This code works perfec but it is not optimized, it has complexity of O(n^2)

  // public static int diagonalSum(int matrix[][]) {
  //   int sum = 0; 

  //   for (int i = 0; i < matrix.length; i++) {
  //     for (int j = 0; j < matrix[0].length; j++) {
  //       if (i == j) {
  //         sum = sum + matrix[i][j];
  //       }
  //       else if (i + j == matrix.length - 1) {
  //         sum = sum + matrix[i][j];
  //       }
  //     }
  //   }
  //   return sum;
  // }

  // This is Optimized solutin with same output:
  public static int diagonalSum(int matrix[][]) {
    int sum = 0;
    
    for (int i = 0; i < matrix.length; i++) {
      // sum of primary diagonal
      sum = sum + matrix[i][i];

      // sum of secondary diagonal
      if (i != matrix.length-1-i) { // it means if ( i != j)
        sum = sum + matrix[i][matrix.length-1-i]; // matrix[i][j] = matrix[i][n-1-i] = matrix[i][matrix.length-1-i]
      } 
    }
    return sum;
  }

  public static void main(String[] args) {
    int matrix[][] = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };

    System.out.println(diagonalSum(matrix)); // output 68
  }

}