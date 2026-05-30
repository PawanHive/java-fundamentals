/*
Add in the Middle of Linked List
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

  // ---------------------------------- addFirst Method -- TC: O(1) -------------------------------------------
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

  // ---------------------------------- addMiddle Method -- TC: O(n) -------------------------------------------
public void addMiddle(int idx,  int data) {

  //if idx = 0, means it is a head pointing case
  if(idx == 0) {
    addFirst(data);
    return;
  }

  Node newNode = new Node(data) ;
  Node temp = head;
  int i = 0;

  while (i < idx-1) {
    temp = temp.next;
    i++;
  }

  // when i = idx-1,means my temp Node = previous one
  newNode.next = temp.next;
  temp.next = newNode;
}
  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT

    ll.print(); // output: LL is empty

    ll.addFirst(2); // initially 2 pointed as HEAD
    ll.print(); // output: 2 --> null

    ll.addFirst(1); // now 1 pointed as HEAD
    ll.print(); // output: 1 --> 2 --> null

    ll.addLast(3);
    ll.print(); // output: 1 --> 2 --> 3 --> null

    ll.addLast(4);
    ll.print(); // output: 1 --> 2 --> 3 --> 4 --> null

    ll.addMiddle(2, 9);
    ll.print(); // output: 1 --> 2 --> 9 --> 3 --> 4 -->  null

  }
}
