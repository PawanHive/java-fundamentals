/*
Add Last in Linked List
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

  // ---------------------------------- addFirst Method -------------------------------------------
  public void addFirst(int data) {

    //step1: create new node
    Node newNode = new Node(data);

    // if linked list is EMPTY
    if(head == null) {
      head = tail = newNode;
      return;
    }

    //step2: newNode next = head
    newNode.next = head; //linking newNode to existing Head Node

    // step3: now head should point to newNode
    head = newNode;
  }

  // ---------------------------------- addLast Method -------------------------------------------

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
  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addLast(3);
    ll.addLast(4);
  }
}
