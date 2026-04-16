

public class Main {
  public static void main(String[] args) {
    int n = 10899;

    while(n > 0) {
      int lastDigit = n % 10; //extract last digit.
      System.out.print(lastDigit);
      n = n / 10; // remove last digit.
    }
  }
}
