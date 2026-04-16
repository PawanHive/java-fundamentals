```java 
public class Main {
  public static void main(String[] args) {

    // Outer loop controls number of lines (rows)
    for(int line = 1; line <= 4; line++) {

      // Inner loop prints stars in each line
      // Number of stars increases with line number
      for (int star = 1; star <= line; star++) {
        System.out.print("* "); // print star on same line
      }

      // Move to next line after printing all stars of current row
      System.out.println();
    }
  }
}
```