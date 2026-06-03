/*
# Valid Parentheses

Given a string s containing just the characters '(' ')' '{' '}' '[' and ']', determine if the input string is valid.

An input string is valid if: 

1. Open brackets must be closed by the same type of brackets
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Example Of right output: 
s ="()[]{}"
s = "()"
s = {[()]}
s = ({[]}())   ---- NOTE: this is also true

Example of Wrong output: 
s = "(]"
s = ")("

Time Complexity : O(n)
*/

import java.util.Stack;

public class Stacks {
  
  public static boolean isValid(String str) {
    Stack<Character> s = new Stack<>();

    for (int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);

      if (ch == '(' || ch == '{' || ch == '[') { // opening
        s.push(ch);
      } else {
        // closing -- suppose "))))" for this there is not opening bracket so at that time stack will be empty
        if (s.isEmpty()) {
          return false;
        }

        // here s.peek() means Stack top Character, if top char = '(' and char from str = ')' it means pair formed and it is true condition and same for '{' & '['
        if (
          (s.peek() == '(' && ch == ')') // () pair
          || (s.peek() == '{' && ch == '}') // {} pair
          || (s.peek() == '[' && ch == ']') // [] pair
        ) {
          s.pop();
        } else {
          return false;
        }        
      }
    }

    if(s.isEmpty()) {
      return true; // after traversing each char stack will be empty so it means all char found their match their pair and pop from stack
    } else {
      return false; // if some extra opening or closing parentheses found means stack is not empty so return false; 
    }
  }

  public static void main(String[] args) {
    String str = "({})[]"; // true
    System.out.println(isValid(str));
  }
}