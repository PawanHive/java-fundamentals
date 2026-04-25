import java.util.*;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for (char ch = 'a'; ch <= 'z'; ch++) { // print abcdefghijklmnop....z
      sb.append(ch);
    }
    
    System.out.println(sb);
  }
}
