import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Print if number is odd or even

    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();

    if(num%2 == 0) {
      System.out.println(num + " is even number.");
    }else {
      System.out.println(num + " is odd number.");
    }
  }
}
