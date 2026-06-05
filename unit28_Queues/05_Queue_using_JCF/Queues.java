/*
Queue using Java Collection Framework (JCF)

isEmpty() -- O(1)
add() -- O(1)
remove() -- O(1)
peek() -- O(1) 
*/

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();  // 'LinkedList' is also correct to implement 'Queue'
    // Queue<Integer> q = new ArrayDeque<>(); // 'ArrayDeque' this is also correct to implement 'Queue'
    /*
    If we have to create Queue then why we write LinkedList in right-side?
    - Queue jo hoti hai Java Collection Framework me, woh class nahi hoti hai bulki 'Interface' hoti hai
    and we can't create 'OBJECT' of 'Interface'

    Only two class can implement Queue in Java, first is "LinkedList" and Second is "ArrayDeque"
    */
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}