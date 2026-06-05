/*
Queue using 2 Stacks;

has two approach to solve:
1st: push() -- O(n) -- we choose this approach here
2nd: pop() -- O(n)

Asked in Interview of : Amazon & Google
*/

import java.util.Queue;
import java.util.Stack;

public class Queues {
  static class Queue {
    static Stack<Integer> s1 = new Stack<>(); // first Stack
    static Stack<Integer> s2 = new Stack<>(); // second Stack

    //isEmpty() 
    public static boolean isEmpty() {
      return s1.isEmpty();
    }

    //add
    public static void add(int data) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop()); // Keep pushing elements from s1 into s2 until s1 is completely empty.
      }

      s1.push(data); // now push whatever data you want to push s1

      while (!s2.isEmpty()) {
        s1.push(s2.pop()); // now Keep pushing elements from s2 into s1 until s2 is completely empty.
      }
    }

    // remove()
    public static int remove() {
      // if Queue is empty
      if(isEmpty()) {
        System.out.println("queue empty");
        return -1;
      }
      // otherwise pop/delete the top/front data from stack
      return s1.pop();
    }

    // peek()
    public static int peek() {
      // if Queue is empty
      if(isEmpty()) {
        System.out.println("queue empty");
        return -1;
      }
      // otherwise peek the top/front data from stack
      return s1.peek();
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}


/*
isEmpty() -- O(1)
add() -- O(n) -- here add has linear complexity
remove() -- O(1)
peek() -- O(1)
*/

