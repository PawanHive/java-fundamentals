/*
Interleave 2 halves of a Queue (even length) 
input:  1 2 3 4 5 6 7 8 9 10
output we want : 1 6 2 7 3 8 4 9 5 10

time complexity: O(n)
*/

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void interLeave(Queue<Integer> q) {
    Queue<Integer> firstHalf = new LinkedList<>();
    int size = q.size();

    // traverse on only half of the element of total queue size 
    // don't write condition like: i<q.size()/2 becaause on every loop the total size of q changes 
    for (int i=0; i<size/2; i++) { 
      firstHalf.add(q.remove());
    }

    // until first half become empty
    while(!firstHalf.isEmpty()) {
      q.add(firstHalf.remove()); // remove from firtHalf and add it into q Queue
      q.add(q.remove()); // now remove one element from q queue and add it in this q queue (from back side)

    }
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);

    interLeave(q);

    // Print : until my q queue become empty;
    while (!q.isEmpty()) {
      System.out.print(q.remove() + " ");
    }
    System.out.println();
  }
}
