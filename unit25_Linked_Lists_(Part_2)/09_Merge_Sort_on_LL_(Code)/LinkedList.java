/*
Merge Sort on a Linked List 
Input  : 5 --> 4 --> 3 --> 2 --> 1 -->  null
output we want: 1 --> 2 --> 3 --> 4 --> 5 -->  null
*/


public class LinkedList {
// NOTE: Class name should match file name (LinkedList) while do LL from scratch (RECOMMENDED)
// to avoid confusion with Java's built-in LinkedList Collections Framework class. (DON'T USE) - in mergesort kind of problem
  
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

  // ---------------------------------- addFirst Method -- TC: O(1)-------------------------------------------
  public void addFirst(int data) {

    // step1: create new node
    Node newNode = new Node(data);

    // if linked list is EMPTY
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step2: newNode next = head
    newNode.next = head; // linking newNode to existing Head Node

    // step3: now head should point to newNode
    head = newNode;
  }

  // ---------------------------------- Print Method -- TC: O(n)-------------------------------------------

  public void print() {
    // basecase
    if (head == null) {
      System.out.println("LL is empty");
      return;
    }

    Node temp = head; // this temp is also pointing to head node // whenever we have to loop over LL, then we have to use temp varialble and make it jump to next
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next; // now temp pointing to next node
    }
    System.out.println(" null");
  }

  // -------------------------------------- getMid()------------------------------------------------------

  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next; // usually we assing Node fast = head but here we assign it to head.next because for even no. of LL we will get mid as left's half (first half) last node, not right's first node.

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow; // mid Node
  }

  // --------------------------------------- merge()--------------------------------------------------------

  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node(-1); // -1 is a dummy Node we will just use to compare with different data
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;

      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedLL.next; // this will delete -1 dummy Node and give only actual LL
  }
  // --------------------------------------- mergeSort() -- TC: O(n log n)----------------------------------------------------

  public Node mergeSort(Node head) {
    // base case
    if (head == null || head.next == null) {
      return head;
    }
    // STEP 1: Find Mid
    Node mid = getMid(head);

    // STEP 2: Left & right half (mergeSort Call)
    Node rightHead = mid.next;
    mid.next = null; // this will basically divide LL in from mid
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    // STEP 3: merge()
    return merge(newLeft, newRight);
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // is not create by java LinkedList collections, it was created from scratch
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    // 5 --> 4 --> 3 --> 2 --> 1 // we have to sort this in ascending order using
    // mergeSort

    ll.print(); // output: 5 --> 4 --> 3 --> 2 --> 1 -->  null
    ll.head = ll.mergeSort(ll.head);
    ll.print(); // output: 1 --> 2 --> 3 --> 4 --> 5 -->  null
  }
}
