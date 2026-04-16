import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Print number from 1 to n
    // my solution:
    Scanner sc = new Scanner(System.in);

    int counter = 1;
    int n = sc.nextInt();

    while(counter <= n) {
      System.out.print(" " + counter);
      counter++;
    }
  }
}
