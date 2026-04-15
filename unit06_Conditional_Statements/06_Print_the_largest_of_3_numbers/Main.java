

public class Main {
  public static void main(String[] args) {
    // Print the largest of 3 numbers

    int A = 1;
    int B = 30;
    int C = 5;

    if(A >= B && A >= C) {
      System.out.println(" bigger no. is: " + A);
    }
    if(B >= A && B >= C) {
      System.out.println(" bigger no. is: " + B);
    } 
    else {
      System.out.println("bigger no. is: " + C);
    }
  }
}
