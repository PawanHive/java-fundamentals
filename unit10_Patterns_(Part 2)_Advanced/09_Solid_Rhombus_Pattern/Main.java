

public class Main {

  public static void solid_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      //print - SPACES
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }

      // print - STARS
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
  public static void main(String[] args) {
    solid_rhombus(5);
  }
}
