/*
# Check if LL is a Palindrome
Example of Palindrome: 1221, racecar, maam

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

// ------------- Check if LL is a Palindrome (slow & fast approach) -- TC: O(n) -------------------------------------------

  // Slow-Fast Approach
  public Node findMid(Node head) { // helper function
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // + 1; //jump only One Node
      fast = fast.next.next; // + 2; // jump directly Two Node
    }

    return slow; // slow is my midNode
  }

  public boolean  checkPalindrome() {

    // base case : (LL will automatically palindrome if it has only one )
    if(head == null || head.next == null) {
      return true;
    }

    // step 1: find mid
    Node midNode = findMid(head);

    // step 2: reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev; // right half head
    Node left = head;

    // step 3: check left half & right half
    while(right != null) {
      if(left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(2);
    ll.addLast(1);

    
    ll.print();
    System.out.println(ll.checkPalindrome());    
    ll.print();
  }
}




