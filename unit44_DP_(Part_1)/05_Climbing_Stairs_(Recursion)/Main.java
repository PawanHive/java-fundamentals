// # Climbing Stairs 
// Count ways to reach the nth stair. The person cam climb either 1 stair or 2 stairs at a time.

// Time Complexity : 2^n

public class Main {
  public static int countWays(int n) {
    if(n == 0) {
      return 1;
    }
    if(n < 0) {
      return 0;
    }
    return countWays(n-1) + countWays(n-2);
  }

  public static void main(String[] args) {
    int n = 5; // n=3 -> 3 and n=4 -> 5 => 8
    System.out.println(countWays(n));
  }
}

// output 8