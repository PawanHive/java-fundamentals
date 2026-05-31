/*
# Reverse a Linked List
(Iterative Approach)

linked List: 1 --> 2 --> 9 --> 3 --> 4 -->  null

Output we want: 4 --> 3 --> 9 --> 2 --> 1 -->  null 
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


// ---------------------------------- Reverse a LL (iterative approach) -- TC: O(n) -------------------------------------------

  public void reverse() {
    Node prev = null; // head ke left side wali Node, jo ki waha kuchh nahi hota
    Node curr = tail = head; // as we are reverse so now our HEAD will be TAIL
    Node next;

    while (curr != null) { // until null become current Node
      // step 1: next Node assign as current next
      next = curr.next; 

      // step 2: now current ka next will be assign as previous
      curr.next = prev;

      // step 3: previous become current
      prev = curr;

      // step 4: now current become my next
      curr = next;
    }

    head = prev; // as we are reversing so null se pehle wala node become HEAD

  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList(); // OBJECT

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(9);
    ll.addLast(3);
    ll.addLast(4);


    ll.print(); // output: 1 --> 2 --> 9 --> 3 --> 4 -->  null
    ll.reverse();
    ll.print(); // output: 4 --> 3 --> 9 --> 2 --> 1 -->  null

    

  }
}




