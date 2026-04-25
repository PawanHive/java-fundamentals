import java.util.*;

public class Main1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");

    // ADD (string) (behind existing one)
    sb.append(" World");  // output: "Hello World" 
    sb.append( " Java");  // output: "Hello World Java"

    // INSERT (string)
    sb.insert(5, " Pawan Yadav"); // output: Hello Pawan Yadav World Java

    // DELETE (string)
    sb.delete(12, 18); // output: Hello Pawan World Java

    // REVERSE (string)
    sb.reverse();  // output: avaJ dlroW nawaP olleH

    
    System.out.println(sb);
  }
}
