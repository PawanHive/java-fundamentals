import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int total = 0;
    
    int i = 1;
    while(i <= n) {
      total = total + i;
      i++;
    }

    System.out.println("total sum is : " + total);
  }
}
