import java.util.*;

public class Main {
  public static int factorial(int n) {
    int f = 1;

    for(int i = 1; i <= n; i++) {
      f = f * i;
    }

    return f; // 'f' is factorial of 'n'
  }
  public static void main(String[] args) {

    // // my user input based solution:
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // int fact = factorial(n);
    // System.out.println(fact);

    // Teacher solution:
    System.out.println(factorial(5));
  }
}