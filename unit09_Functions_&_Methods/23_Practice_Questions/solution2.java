import java.util.*;

// MY SOLUTION: 

// public class solution2 {
//   public static boolean isEven(int n) {
//     if(n % 2 == 0) {
//       return true;
//     }

//     return false;
//   }
//   public static void main(String[] args) {
//     System.out.println(isEven(20));
//   }
// }


// TEACHER SOLUTION: 

public class solution2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.print("Enter an integer: ");
    num = sc.nextInt();

    if(isEven(num)) {
      System.out.println("Number is even");
    }else {
      System.out.println("Number is odd");
    }
  }

  public static boolean isEven(int number) {
    if(number % 2 == 0) {
      return true;
    }
    else {
      return false;
    }
  }
}