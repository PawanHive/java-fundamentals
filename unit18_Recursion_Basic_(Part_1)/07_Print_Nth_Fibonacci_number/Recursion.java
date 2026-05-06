// finding nth fibonacci number: 0 1 1 2 3 5 8 13 21 ...

public class Recursion {
  public static int fib(int n) {
    if (n == 0 || n ==1) {
      return n; // mean n == 0 then 0 will return and if n ==1 then 1 will return.
    }
    int fibnm1 = fib(n - 1); // 'fibnm1' = "fibonacci of n minus 1"
    int fibnm2 = fib(n - 2); // 'fibnm2' = "fibonacci of n minus 2"
    int fibn = fibnm1 + fibnm2;
    return fibn;
  }
  public static void main(String[] args) {
    int n = 7; // here n tells nth position  
    System.out.println(fib(n)); // output: 13
  }
}


    // if (n == 0) {
    //   return 0;
    // }
    // if (n == 1) {
    //   return 1;
    // }

    // refactor part is below 

    // if (n == 0 || n ==1) {
    //   return n; // mean n == 0 then 0 will return and if n ==1 then 1 will return.
    // }