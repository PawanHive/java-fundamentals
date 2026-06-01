/*


Zig-Zag Linked List
For a linked list of the form : L(1)->L(2)->L(3)->L(4) ... L(n-1)->L(n)
convert it into a zig-zag form i.e. : L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)...

Example:
Input  : 1 -> 2 -> 3 -> 4 -> 5
Output : 1 -> 5 -> 2 -> 4 -> 3
*/

public class LinkedList {

  // Defining Nodes
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

// --------------------------------- zigZag() ---------------------------------------------------
  public void zigZag() {
    // STEP 1: find mid
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next; // jump +1 node
      fast = fast.next.next; // jump +2 node
    }
    Node mid = slow; 
    
    // STEP 3: reverse 2nd half 
    Node curr = mid.next;
    mid.next = null; // this will basically divide LL from half(mid)
    Node prev = null;
    Node next;

    while (curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL, nextR; // nextL stand for "next Left" & nextR stand for "next Right"

    // STEP 3: alt mere - zig-zag merge
    while(left != null && right != null) {
      nextL = left.next; // nextL stan 
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      // update
      left = nextL;
      right = nextR;
    }
  }
  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // is not create by java LinkedList collections, it was created from scratch
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    // 1 --> 2 --> 3 --> 4 --> 5 

    ll.print(); // output: 1 --> 2 --> 3 --> 4 --> 5 -->  null
    ll.zigZag();
    ll.print(); // output: 1 --> 5 --> 2 --> 4 --> 3 -->  null
  }
}
