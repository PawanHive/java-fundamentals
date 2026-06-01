/*
HERE WE LEARNED HOW TO CREATE DATA STRUCTURE FROM SCRETCH ( WE CAN ALSO DO THIS add, print, remove USING JAVA COLLECTIONS FRAMEWORK, but interview can as to do it manually)

Add First
Add Last
Print a LL
Add in the Middle of LL
Size of a LL
Remove First in LL
Remove Last in LL
Remove Last Node of Linked List
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
  public static int size; // java by-default initialize its value with 0

  // ---------------------------------- addFirst Method -- TC: O(1) -------------------------------------------
  public void addFirst(int data) {

    //step1: create new node
    Node newNode = new Node(data);
    size++;
    
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
    size++;
    
    // if linked list is EMPTY
    if(head == null) {  // REMEMBER: if head is NULL then it means linked List is EMPTY
      head = tail = newNode;
      return;
    }
    
    // step2: linking newNode to existing Tail Node
    tail.next = newNode; 

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
    size++;
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

// ---------------------------------- removeFirst Method -- TC: O(1) -------------------------------------------

public int removeFirst() {

  // special case
  if(size == 0) { // if linked list is empty
    System.out.println("LL is empty");
    return Integer.MIN_VALUE;
  } else if (size == 1) { // if linked list has only one Node and if we want to remove it then we have to change our HEAD & TAIL both to NULL
    int val = head.data;
    head = tail = null;
    size = 0; // now size of LL will be = 0
    return val;
  }

  int val = head.data; // selected Node which we want to delete
  head = head.next; // means now head will point to next data, when head started pointing to next Node, then first Node will automatically remove by java garbage collector
  size--;
  return val;
}

// ---------------------------------- removeLast Method -- TC: O(n) -------------------------------------------

public int removeLast() {
  if(size == 0) {
    System.out.println("LL is empty");
    return Integer.MIN_VALUE;
  } else if(size == 1) {
    int val = head.data;
    head = tail = null;
    size = 0;
    return val;
  }
  // prev Node will be : i = size-2
  Node prev = head; 
  for(int i=0; i<size-2; i++) {
    prev = prev.next; // previous jump to each and every Node until reach size-2
  }

  int val = prev.next.data; // tail.data
  prev.next = null;
  tail = prev;
  size--;
  return val;
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

    ll.addMiddle(2, 9); // at 2nd idx 9 will insert
    ll.print(); // output: 1 --> 2 --> 9 --> 3 --> 4 -->  null

    // System.out.println(ll.size);

    ll.removeFirst();
    ll.print(); // output: 2 --> 9 --> 3 --> 4 -->  null

    ll.removeLast();
    ll.print(); // output: 2 --> 9 --> 3 -->  null

  }
}
