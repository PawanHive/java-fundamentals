/*
# Search (Iterative)

Search for a key in a Linked List. Return the position where it is found. If not found, return -1.
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

  // ---------------------------------- addLast Method -- TC: O(1) -------------------------------------------

  public void addLast(int data) {
    // step1: create new Node
    Node newNode = new Node(data);

    
    // if linked list is EMPTY
    if(head == null) {  // REMEMBER: if head is NULL then it means linked List is EMPTY
      head = tail = newNode;
      return;
    }
    
    // step2: newNode next = head
    tail.next = newNode; // linking newNode to existing Tail Node

    // step3: now tail should point to newNode
    tail = newNode;
  }

  // ---------------------------------- Print Method -- TC: O(n) -------------------------------------------

  public void print() {
    // basecase 
    if(head == null) {
      System.out.println("LL is empty");
      return;
    }

    Node temp = head; // this temp is also pointing to head node // whenever we have to loop over LL, then we have to use temp varialble and make it jump to next
    while(temp != null) {
      System.out.print(temp.data + " --> "); 
      temp = temp.next; // now temp pointing to next node
    }
    System.out.println(" null");
  }


// ---------------------------------- Iterative Search Method -- TC: O(n) -------------------------------------------
/*
Search for a key in a Linked List. Return the position where it is found. If not found, return -1.
*/
  public int itrSearch(int key) {
    Node temp = head;
    int i = 0;

    while(temp != null) {
      if(temp.data == key) { // key found
        return i;
      }
      temp = temp.next;
      i++;
    }

    // key not found
    return -1;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT

    ll.print(); // output: LL is empty

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(9);
    ll.addLast(4);
    ll.addLast(5);

    // # Iterative Search Call
    System.out.println(ll.itrSearch(9)); // output: 2  // means 9 is present it 2nd idx
    System.out.println(ll.itrSearch(10));// output: -1 // means not exist

  }
}
