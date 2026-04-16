

public class Main {
  public static void main(String[] args) {
    int n = 4;

    //outer loop ( handle each no. of line)
    for(int line = 1; line <= n; line++) {
      //inner loop (handle single line at a time)
      for(int num = 1; num <= line; num++) {
        System.out.print(num+ " ");
      }
      System.out.println();
    }
  }
}
