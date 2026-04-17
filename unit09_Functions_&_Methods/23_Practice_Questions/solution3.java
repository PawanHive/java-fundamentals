import java.util.*;

// MY SOLUTION:

// public class solution3 {

//   public static boolean isPalindrome(int number) {
//     int original = number;
//     int reverse = 0;
    
//     while (number != 0) {
//       int remainder = number % 10;
//       reverse = reverse * 10 + remainder;
//       number = number / 10;
//     }

//     if(original == reverse) {
//       return true;
//     }

//     return false;
//   }
//   public static void main(String[] args) {
//     System.out.println(isPalindrome(121));
//   }
  
// }


// TEACHER SOLUTION: 

public class solution3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter a number: ");
    int palindrome = sc.nextInt();

    if(isPalindrome(palindrome)) {
      System.out.println("Number: " + palindrome + " is a palindrome");
    }else {
      System.out.println("Number: " + palindrome + " is not a palindrome");
    }
  }

  public static boolean isPalindrome(int number) {
    int palindrome = number; // copied number into variable
    int reverse = 0;

    while (palindrome != 0) {
      int remainder = palindrome % 10;
      reverse = reverse * 10 + remainder; // shifting position to right side like 1*10 + 2 = 12 supposer our no. is 321
      palindrome = palindrome / 10;
    }
    // if original and the reverse of number is equal means
    // number is plindrome in java
    if (number == reverse) {
      return true;
    }

    return false;
  }
}
