import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int marks = sc.nextInt();

    if( marks >= 33) {
      System.out.println("PASS");
    }else {
      System.out.println("Fail");
    }
  }
}
