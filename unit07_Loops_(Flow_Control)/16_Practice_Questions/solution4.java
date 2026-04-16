import java.util.*;

public class solution4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // my solution
    // int num = sc.nextInt();
    // int table = 1;

    // for( int i = 1; i <= 10; i++ ) {
    //   table = num * i;
    //   System.out.println(table);
    // } 
    

    // teacher solution
    int num = sc.nextInt();

    for( int i = 1; i <= 10; i++ ) {
      System.out.println(num + " * " + i + " = " + num*i);
    } 
  }
}
