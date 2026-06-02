/*
STACK's BASIC OPERATIONS using ArrayList
*/

import java.util.ArrayList;

public class Stacks {
  static class Stack { // class name should be "Stack"
    static ArrayList<Integer> list = new ArrayList<>();

//------------------------------------------ isEmpty() -- TC: O(1) -------------------------------------------
    // check stack empty or not
    public static boolean isEmpty() {
      return list.size() == 0;
    }

//------------------------------------------ push() -- TC: O(1) -------------------------------------------

    // PUSH (add)
    public static void push(int data) {
      list.add(data);
    }

//------------------------------------------ pop() -- TC: O(1) -------------------------------------------

    // POP (delete)
    public static int pop() {
      // corner case
      if(isEmpty()) { // if stack is empty
        return -1;
      }

      int top = list.get(list.size()-1); // get() method used i ArrayList to select, and here we are selecting top elelment of the stack (list.size()-1)
      list.remove(list.size()-1); // remove() used to delete;
      return top; // by convension we return that element when we delete any top element.
    }

//------------------------------------------ peek() -- TC: O(1) -------------------------------------------

    // PEEK (jhankna ki top element kounsa hai)
    public static int peek() {
      // corner case
      if(isEmpty()) { // if stack is empty
        return -1;
      }
      
      return list.get(list.size()-1); // now here get() method will select top element and return it
    }
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
