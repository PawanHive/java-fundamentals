/*
Queue using Linked List

asked in Interview of : Amazon
*/

public class Queues {

  static class Node {
    int data;
    Node next;

    // constructor
    Node (int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Queue {
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
      return head == null && tail == null;
    }

    // add
    public static void add (int data) {
      Node newNode = new Node(data); // newNode created

      // if LL has no Node
      if(head == null) {
        head = tail = newNode;
        return;
      }

      // if LL already has Node
      tail.next = newNode;
      tail = newNode;
    }

    // remove
    public static int remove() {
      // if LL is empty
      if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }

      int front = head.data;
      // if LL has even single element
      if(tail == head) {
        tail = head = null;
      } else {
        head = head.next;// head start pointing to next head means first head will automatically removed
      }
      return front;
    }

    //peek
    public static int peek() {
      if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      return head.data;
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