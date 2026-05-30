/*
Add First in Linked List
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
    newNode.next = head; //linking newNode to existing Node

    // step3: now head should point to newNode
    head = newNode;
  }
  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT
    ll.addFirst(1);
    ll.addFirst(2);
  }
}
