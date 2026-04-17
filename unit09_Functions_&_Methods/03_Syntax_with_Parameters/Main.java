import java.util.*;

public class Main {

  public static void calculateSum(int num1, int num2) { // 'num1' & 'num2' taking value from function call (a, b);
    int sum = num1 + num2;
    System.out.println("Sum is " + sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    calculateSum(a, b); // here passing value of 'a' & 'b' to 'num1' & 'num2' 
  }
}
