/*
N-Queen - Print 1 solution
Check if problem can be solved & print only 1 solution to N Queens problem.
*/

public class Backtraking {

  public static boolean isSafe(char board[][], int row, int col) {
    // vertical up
    for(int i=row-1; i>=0; i--) {
      if(board[i][col] == 'Q') {
        return false;
      }
    }

    // diagonal left up
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
      if(board[i][j] == 'Q') {
        return false;
      }
    }

    // diagonal right up
    for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
      if(board[i][j] == 'Q') {
        return false;
      }
    }

    return true;
  }


  public static boolean nQueens(char board[][], int row) {
    // base
    if(row == board.length) {
      // printBoard(board);
      return true;
    }

    // column loop
    for(int j=0; j<board.length; j++) {
      if(isSafe(board, row, j)) {
        board[row][j] = 'Q'; // Q = queen
        if(nQueens(board, row+1)) {  // recursive function call
          return true;
        } 
        board[row][j] = 'x'; // backtracking step // x = means nothing/empty
      }
    }

    return false;
  }

  // print function
  public static void printBoard(char board[][]) {
    System.out.println("-------- chess board ---------");
    for(int i=0; i<board.length; i++) {
      for(int j=0; j<board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char [n][n];
    //initialize
    for (int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        board[i][j] = 'x';
      }
    }

    if(nQueens(board, 0)) {
      System.out.println("Solution is possible");
      printBoard(board);
    } else {
      System.out.println("Solution is not possible");
    }
  }
}