

public class Main {
  public static void main(String[] args) {
    // this is 'character' not "string"
    char arr[] = {'a', 'b', 'c', 'd'};

    // ----------------------------------------------------------------------------------------------

    // Ways to Create string:
    // 1. Using String Literal (Most Common)
    String str = "abcd";

    // 2. Using 'new' keyword
    String str2 = new String("Hello");

    // ----------------------------------------------------------------------------------------------

    // String is IMMUTABLE:
    // Once a string is created, it cannot be changed.
    String strr = "Hello";
    strr = strr + "World";
    /*
    Note:
    "Hello" is NOT changed
    A new string "Hello World" is created
    */

    // ----------------------------------------------------------------------------------------------


  }
}
