// sum of firt N natural number.

public class Recursion {
  public static int calcSum(int n) {
    if (n == 1) { // base case
      return 1;
    }
    int Snm1 = calcSum(n - 1); // recursive function   ...// 'Snm1' = "sum of n natural number minus 1"
    int fn = n + Snm1;
    return fn;
  }
  public static void main(String[] args) {
    int n = 3; 
    System.out.println(calcSum(n));
  }
}
