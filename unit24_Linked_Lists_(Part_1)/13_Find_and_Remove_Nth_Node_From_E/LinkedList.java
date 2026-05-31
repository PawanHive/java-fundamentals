/*
# find & Remove Nth node from End
(Iterative Approach)


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

// ---------------------------------- Remove Nth Node from end -- TC: O(n) -------------------------------------------

  public void deleteNthfromEnd(int n) {
    // calculate size
    int size = 0;
    Node temp = head;
    
    while(temp != null) {
      temp = temp.next;
      size++;
    }

    // suppose we have to delete HEAD
    if(n == size) {
      head = head.next; // removeFirst
      return;
    }

    // size-n (size minus n)
    int i = 1; 
    int iToFind = size-n; // iTofind = index to found
    Node prev = head;

    while (i < iToFind) {
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
    return;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT

    ll.addFirst(1);
    ll.addLast(2);
    ll.addLast(9);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();

    ll.deleteNthfromEnd(3); // means delet 3rd node from end // means we have to delete data: 9

    ll.print();
    
  }
}




