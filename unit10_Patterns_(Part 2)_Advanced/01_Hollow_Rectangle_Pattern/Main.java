

public class Main {

  public static void hollow_rectangle(int totRows, int totCols) {
    // outer loop - decide no. of output line
    for(int i = 1; i <= totRows; i++){
      // inner loop - decide no. of character in single line  
      for(int j = 1; j <= totCols; j++) {
        // cell - (i, j)
        if(i == 1 || i == totRows || j == 1 || j == totCols) {
          // this condition true only for boundary cells
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    hollow_rectangle(4, 5);
  }
}
