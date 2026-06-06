/*
# Stack & Queue using Deque;

Stack implementing using Deque:

push() -- Deque: addLast() --  O(1)
pop() -- Deque: removeLast() -- O(1)
peek() -- Deque: getLast() -- O(1)

*/

import java.util.Deque;
import java.util.LinkedList;

public class Main {
  // Iplementing Stack using Deque (advantage is we don't need to write multiple line of code of definig method for push(), pop() and peek())
  static class Stack {
    Deque<Integer> deque = new LinkedList<>();

    // push() operation using Deque
    public void push(int data) {
      deque.addLast(data);
    }

    // pop() operation using Deque
    public int pop() {
      return deque.removeLast();
    }

    // peek() operation using Deque
    public int peek() {
      return deque.getLast();
    }

  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println("peek = " + s.peek());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
  }
}
