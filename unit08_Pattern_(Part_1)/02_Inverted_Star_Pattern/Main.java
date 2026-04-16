

public class Main {
  public static void main(String[] args) {

    // // My solution
    // for(int line = 10; line >= 1; line--) {
    //   for ( int star = 1; star <= line; star++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println(); // just to jump to next line
    // }


    // Teacher Solution
    int n = 7;

    for(int line = 1; line <= n; line++) {
      for(int star=1; star<=n-line+1; star++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
