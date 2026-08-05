/*
Fibonacci using Tabulation of DP
*/

public class Main {

  public static int fibTabulation(int n) {
    int dp[] = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    for(int i=2; i<=n; i++) {
      dp[i] = dp[i-1] + dp[i-2];
    }

    return dp[n]; // ans
  }

  public static void main(String[] args) {
    int n = 6;
    int[] f = new int[n+1]; 
    System.out.println(fibTabulation(n));
  }
}

/*
output : 8

0 1 1 2 3 5 8
*/