/*
Removing cycle in Linked List
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

// ---------------------------- Removing Cycle in LL  -- TC: O(n)----------------------------------------

  public static void removeCycle() {
    // STEP 1: detect cycle
    Node slow = head; 
    Node fast = head;
    boolean isCycleExist = false;
    while(fast != null && fast.next != null) {
      slow = slow.next; // jump +1
      fast = fast.next.next; // jump +2

      if(slow == fast) {
        isCycleExist = true; // cycle exists
        break;
      } 
    }
    if(isCycleExist == false) {
      return;
    }

    // STEP 2: find meeting point (cycle formation point)
    slow = head;
    Node prev = null; // last node
    while (slow != fast) {
      prev = fast;
      slow = slow.next; // jump +1 only
      fast = fast.next; // this will also jump +1 Node only
    }

    // STEP 3: remove cycle --> last.next = null
    prev.next = null;
  }
  public static void main(String[] args) {
    head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;

    // 1 --> 2 --> 3 --> 2

    System.out.println(isCycle()); // output: true
    removeCycle();
    System.out.println(isCycle()); // after remove cycle now LL has no cycle so // output: false
  }
}
