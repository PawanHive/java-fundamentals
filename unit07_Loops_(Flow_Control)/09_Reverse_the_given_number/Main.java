import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // // My solution:
    // int n = sc.nextInt();

    // while(n > 0) {
    //   int lastDigit = n % 10; // extract last digit as modulo(remainder)
    //   System.out.print(lastDigit);
    //   n = n / 10; // remove last digit (by dividing), actually divide give the value only after removing last one
    // }

    // Teacher solution: (advantage is we can store 'reverse');
    int n = 10899;
    int rev = 0;

    while(n > 0) {
      int lastDigit = n % 10;
      rev = (rev * 10) + lastDigit;
      n = n / 10;
    }

    System.out.println(rev);
  }
}
