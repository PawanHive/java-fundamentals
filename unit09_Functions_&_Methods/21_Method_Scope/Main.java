public class Main {

  public static void show() {
    int a = 10; // method scope variable
    System.out.println(a);
  }

  public static void main(String[] args) {
    show();
    // System.out.println(a); ❌ ERROR (a is not visible here)
  }
}