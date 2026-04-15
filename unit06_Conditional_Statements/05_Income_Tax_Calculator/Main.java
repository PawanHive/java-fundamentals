import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // income tax calculator

    Scanner sc = new Scanner(System.in);

    int income = sc.nextInt();
    int tax;

    if (income <= 500000) {
      tax = 0;
      System.out.println("your tax is: " + tax);
    }
    else if (income >= 500000 && income < 1000000) {
      tax = (int) (income * 0.2);
      System.out.println("your tax is: " + tax);
    }
    else {
      tax = (int) (income * 0.3);
      System.out.println("your tax is:" + tax);

    }
  }
}
