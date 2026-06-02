/*
Question : Push at the Bottom of the Stack using (Recursion) 
TC: O(n)
*/

import java.util.Stack;

public class Stacks {
// -------------------------------------- pushAtBottom() of Stack ---------------------------------------
  public static void pushAtBottom(Stack<Integer> s, int data) {
    // base case
    if(s.isEmpty()) {
      s.push(data);
      return;
    }

    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottom(s, 4);

    // PRINT until stack become empty
    while(!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }
}

/*
Output: 

3
2
1
4
*/