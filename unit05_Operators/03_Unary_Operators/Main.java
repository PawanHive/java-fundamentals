

public class Main {
  public static void main(String[] args) {

    // pre-increment
    int a = 10;
    int b = ++a; // (change then assign)
    System.out.println("pre-increment = " + a); // 11
    System.out.println("pre-increment = " + b); // 11

    // post-increment
    int c = 10;
    int d = c++; // (assign then change
    System.out.println("post-increment = " + c); // 11
    System.out.println("post-increment = " + d); // 10

    // pre-decrement
    int e = 10;
    int f = --e; // (change then assign)
    System.out.println("pre-decrement = " + e); // 9
    System.out.println("pre-decrement = " + f); // 9

    // post-decrement
    int g = 10;
    int h = g--; // (assign then change)
    System.out.println("post-decrement = " + g); // 11
    System.out.println("post-decrement = " + h);

  }
}
