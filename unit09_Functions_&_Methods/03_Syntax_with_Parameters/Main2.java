import java.util.*;

public class Main2 {

  public static int calculateSum(int num1, int num2) { // parameters or formal paratmers  // 'num1' & 'num2' taking value from function call (a, b);
    int sum = num1 + num2;
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculateSum(a, b); // arguments or actual paramters // here passing value of 'a' & 'b' to 'num1' & 'num2' // remember this 'sum' variable is different than 'sum' variable declared in calculateSum() function
    System.out.println("Sum is " + sum);
  }
}
