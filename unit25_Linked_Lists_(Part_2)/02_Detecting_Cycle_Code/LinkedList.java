/*
Detecting cycle in Linked List
*/

public class LinkedList {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;

// -------------- Detecting Cycle in LL (using Floyd's Cycle Finding Algorithm) -- TC: O(n)----------------------

  public static boolean isCycle() {
    // initilalize pointers
    Node slow = head; 
    Node fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next; // jump +1
      fast = fast.next.next; // jump +2

      if(slow == fast) {
        return true; // cycle exists
      }
    }

    return false; // cycle doesn't exist
  }
  public static void main(String[] args) {
    head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;

    // 1 --> 2 --> 3 --> 1

    System.out.println(isCycle());
  }
}
