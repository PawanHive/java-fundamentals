public class Main {

  public static void main(String[] args) {

    if (true) {
      int x = 5; // block scope variable
      System.out.println(x);
    }

    // System.out.println(x); ❌ ERROR (x is inside if block)
  }
}
