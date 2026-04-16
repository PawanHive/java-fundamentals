import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("enter your number: ");
      int num = sc.nextInt();
      if(num % 10 == 0)  {
        continue;
        
      }
      System.out.println("number was: " + num);
    } while(true);
  }
}
