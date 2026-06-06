/*
Deque (Double ended queue) 
here we can remove and add from both side 

addFirst()
addLast()
removeFirst()
removeLast()
getFirst()
getLast()
*/

import java.util.Deque;
import java.util.LinkedList;

public class Deques {

  public static void main(String[] args) {
    Deque<Integer> deque = new LinkedList<>();
    deque.addFirst(1); // 1
    deque.addFirst(2); // 2 1 
    deque.addLast(3); // 2 1 3
    deque.addLast(4); // 2 1 3 4
    System.out.println(deque); // output: [2, 1, 3, 4]

    deque.removeFirst();
    System.out.println(deque); // output: [1, 3, 4]

    deque.removeLast();
    System.out.println(deque); // output: [1, 3]


    System.out.println("first element = " + deque.getFirst()); // output: first element = 1
    System.out.println("last element = " + deque.getLast()); // output: last element = 3
  }
}