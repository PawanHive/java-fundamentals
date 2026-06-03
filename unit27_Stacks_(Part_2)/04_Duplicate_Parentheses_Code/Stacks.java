/*
Duplicate Parentheses

Given a balanced expression, find if it contains duplicate parentheses or not. A set of 
parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.

Return a true if it contains duplicates else return false.

TRUE Examples: 
s = (((a + (b))) + (c + d))
s = ((((a) + (b)) + c + d))
s = (((a + b)) + c)


FALSE Examples: 
s = ((a + b) + (c + d))

Key Idea: if there is not extra item between two parentheses means that parentheses is DUPLICATE, so return TRUE from there

Time Complexity : O(n)
*/

import java.util.Stack;

public class Stacks {
  public static boolean isDuplicate(String str) {
    Stack<Character> s = new Stack<>();
  
    for (int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);
  
      // CLOSING
      if(ch == ')') {
        int count = 0;
        while (s.pop() != '(') { // it will compare and also pop(delete) opening parentheses
          count++;
        }
  
        // count will < 1 only when there is no any operator or operands exists between two parentheses, so it means that parentheses is useless and we call useless parentheses as it is DUPLICATE
        if (count < 1) {
          return true; // DUPLICATE parentheses exist
        }
      } else {
        // OPENING
        s.push(ch);
      }
    }

    return false;
  }
  public static void main(String[] args) {
    String str = "((a + b))"; // true
    String str2 = "(a - b)"; // false --- meeans no duplicate(unnecessary) parentheses

    System.out.println(isDuplicate(str));
    
  }
}
