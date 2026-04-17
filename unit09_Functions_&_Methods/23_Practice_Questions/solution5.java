import java.util.*;

// MY SOLUTION:

// public class solution5 {
//   public static int digitSum(int number) {
//     int sum = 0;

//     while(number != 0) {
//       int lastdigit = number % 10;
//       sum = sum + lastdigit;
//       number = number / 10;
//     }
//     return sum;
//   }
//   public static void main(String[] args) {
//     System.out.println(digitSum(321654));
//   }
  
// }

// TEACHER SOLUTION: 

public class solution5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input an integer: ");
    int digits = sc.nextInt();
    System.out.println("The sum is " + sumDigits(digits));
  }


  public static int sumDigits(int n) {
    int sumOfDigits = 0;
    while(n > 0) {
      int lastDigits = n % 10;
      sumOfDigits += lastDigits;
      n /= 10;
    }
    return sumOfDigits;
  }
}