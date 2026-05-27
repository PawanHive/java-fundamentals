

public class Main {

  //is number prime or not?
  // Prime Number definition: A prime number has exactly 2 factors: 1 and itself;

  // only for n >= 2
  public static boolean isPrime(int n) {
    // corner cases //2
    if(n == 2) {
      return true;
    }

    for(int i = 2; i <= n-1; i++) {
      if(n % i == 0) { //completely dividing
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }
}
