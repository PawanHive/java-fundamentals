/*
# Stack & Queue using Deque;

Queue implementing using Deque:

add() -- Deque: addLast() -- O(1)
remove() -- Deque: removeFirst() -- O(1)
peek() -- Deque: getFrist() -- O(1)
*/

import java.util.Deque;
import java.util.LinkedList;

public class Main {
  static class Queue {
    // Iplementing Queue using Deque (advantage is we don't need to write multiple line of code of definig method for add(), remove() and peek())
    Deque<Integer> deque = new LinkedList<>();

    // add() operation using Deque
    public void add(int data) {
      deque.addLast(data);
    }

    // remove() operation using Deque
    public int remove() {
      return deque.removeFirst();
    }

    // peek() operation using Deque
    public int peek() {
      return deque.getFirst();
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    System.out.println("Peek = " + q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
  }
}