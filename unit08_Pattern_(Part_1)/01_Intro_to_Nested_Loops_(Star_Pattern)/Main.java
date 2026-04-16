

public class Main {
  public static void main(String[] args) {
    // handle line after line
    for(int line = 1; line <= 4; line++) {
      // one line only at a time
      for ( int star = 1; star <= line; star++) {
        System.out.print("* ");
      }
      System.out.println(); // just to jump to next line
    }
  }
}
