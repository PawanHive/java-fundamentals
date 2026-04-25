import java.util.*;

public class Main {
  public static void main(String[] args) {
    String s1 = "Tony";
    String s2 = "Tony";
    String s3 = new String("Tony");

    // Telling s1 & s2 is EQUAL
    if (s1 == s2) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }

    // Telling s1 & s3 is NOT EQUAL
    if (s1 == s3) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }

    // Now telling s1 & s3 is EQUAL, when we use ".equals()" method.
    if (s1.equals(s3)) {
      System.out.println("Strings are equal");
    } else {
      System.out.println("Strings are not equal");
    }
  }
}


/*
NOTE: 

- `.equals()` is used to compare **string content (value)**  
- `==` compares **memory location**, not value  
- `.equals()` is **case-sensitive**
*/