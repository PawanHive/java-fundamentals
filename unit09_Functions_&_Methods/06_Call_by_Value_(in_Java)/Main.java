

public class Main {
  
  public static void swap(int a, int b) {
    // swap 
    int temp = a;
    a = b;
    b = temp;

    // These changes are only happening to COPIES
    System.out.println("Inside swap:");
    System.out.println("a = " + a); // 10
    System.out.println("b = " + b); // 5

  }
  public static void main(String[] args) {
    // Swap - values exchage
    int a = 5;
    int b= 10;

    System.out.println("Before swap:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // Passing values → Java creates COPIES of a and b
    swap(a, b);

    // Original values remain unchanged
    // because Java uses CALL BY VALUE
    System.out.println("After swap in main function:");
    System.out.println("a = " + a); // still 5
    System.out.println("b = " + b); // still 10
  }
}



    // // swap 
    // int temp = a;
    // a = b;
    // b = temp;

    // System.out.println("a = " + a);
    // System.out.println("b = " + b);