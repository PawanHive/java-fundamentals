import java.util.*;

// MY SOLUTION:

// public class solution1 {

//   public static int avg(int a, int b, int c) {
//     int avg = (a + b + c) / 3;
//     return avg;
//   }
//   public static void main(String[] args) {
//     System.out.println(avg(3, 4, 5));
//   }
// }


// TEACHER SOLUTION: 

public class solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the first number: ");
    double x = sc.nextDouble();

    System.out.println("Input the second number: ");
    double y = sc.nextDouble();

    System.out.println("Input the third number: ");
    double z = sc.nextDouble();

    System.out.println("The average value is " + average(x, y, z) + "\n");
  }

  public static double average(double x, double y, double z) {
    return (x + y + z) / 3;
  }
}