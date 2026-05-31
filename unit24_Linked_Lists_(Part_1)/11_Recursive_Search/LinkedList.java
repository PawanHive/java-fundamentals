/*
# Recursive Search

Search for a key in a Linked List. Return the position where it is found. If not found, return -1.
Using Recursion.
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


// ---------------------------------- Recursive Search Method -- TC: O(n) -------------------------------------------
/*
Search for a key in a Linked List. Return the position where it is found. If not found, return -1.
Using Recursion.
*/

  //recursive search helper function ( it is actual recursive function)
  public int helper(Node head, int key) {
    // base case
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return 0; // idx is 0 if key matches to HEAD data
    }


    int idx = helper(head.next, key); // recursive function, go ahead to search
    if(idx == -1) {
      return -1; // not found
    }

    return idx+1; // if found 
  }

  // recursive function
  public int recSearch(int key) {
    return helper(head, key);
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT

    ll.print(); // output: LL is empty

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(9);
    ll.addLast(4);
    ll.addLast(5);

  
    // # recursive search call
    System.out.println(ll.recSearch(9)); // output: 2  // means 9 is present it 1st idx
    System.out.println(ll.recSearch(10));// output: -1 // means not exist

  }
}
