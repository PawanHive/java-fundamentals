/*
Find the Fibonacci

time complexity : 
*/

public class Main {

  // fibonacci()
  public static int fib(int n, int f[]) {
    if(n == 0 || n == 1) {
      return n;
    }

    if(f[n] !=0) {
      return f[n];
    }

    f[n] = fib(n-1, f) + fib(n-2, f);
    return f[n];
  }
  public static void main(String[] args) {
    int n = 6;
    int f[] = new int[n+1]; // first initialized with 0, 0, 0, 0,
    System.out.println(fib(n, f));
  }
}

/*
output : 8

0 1 1 2 3 5 8
*/