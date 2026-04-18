

public class Main {

  public static void hollow_rhombus(int n) {
    //outer loop - decides no. of row in pattern
    for (int i = 1; i <= n; i++) {
      // inner loop
      // print - SPACES 
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }

      // print - hollow rectangle - STARS  (code of hollow rectangle will work same for hollow rhombus)
      for (int j = 1; j <= n; j++) {
        if(i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }
  public static void main(String[] args) {
    hollow_rhombus(5);
  }
}
