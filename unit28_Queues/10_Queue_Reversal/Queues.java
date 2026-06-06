/*
queue Reversal
input: 1 2 3 4 5
output: 5 4 3 2 1

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Queues {
  public static void reverse(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();

    // until q Queue become empty 
    while (!q.isEmpty()) {
      s.push(q.remove()); // remove element from q Queue and push it into s Stack
    }

    // Now until s Stact become empty
    while (!s.isEmpty()) {
      q.add(s.pop()); // now remove element from s Stack and add it into q Queue ... and you will q Queue is REVERSED now.
    }
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);    
    q.add(2);    
    q.add(3);    
    q.add(4);    
    q.add(5);    

    reverse(q);;

    // print: until q Queue become empty
    while (!q.isEmpty()) {
      System.out.print(q.remove() + " ");
    }
    System.out.println();
  }
}