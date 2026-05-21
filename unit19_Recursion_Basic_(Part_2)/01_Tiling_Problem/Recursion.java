import java.util.*;

public class Recursion {
  public static int tilingProblem(int n) { // 2 * n = (floor size)

    // base case 
    if (n == 0 || n == 1) {
      return 1;
    }
    // // vertical choice
    // int fnm1 = tilingProblem(n-1);
  
    // // horizontal choice
    // int fnm2 = tilingProblem(n-2);

    // // total ways
    // int totWays = fnm1 + fnm2;
    // return totWays;

    // above code writen in single line
    return tilingProblem(n-1) + tilingProblem(n-2);
  }
  public static void main(String[] args) {
    System.out.println(tilingProblem(4)); // here n is length and width of the floor already given in question and the solution will be exactly same for any no. length given
  }
}
