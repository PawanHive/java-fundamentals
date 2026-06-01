/*
Reverse a Doubly Linked List
*/

public class DoubleLL {
  // Defining Nodes
  public class Node {
    int data; 
    Node next; // point to next object address
    Node prev; // point to previous object address

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

// -----------------------------------addFirst() operation in Doubly LL -----------------------------------
  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    
    if(head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head; // linking newNode to existing Head Node
    head.prev = newNode; // linking previous Node of Head to newNode
    head = newNode; // Now head as to become newNode as it added as FirstNode
  }  

// -----------------------------------addLast() operation in Doubly LL -----------------------------------
  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;

    if(head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
  }

// -----------------------------------print() operation in Doubly LL -----------------------------------
  public void print() {
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data  + " <--> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

// ----------------------------------- reverse() a Doubly LL ---------------------------------------------

  public void reverse() {
    Node curr = head; 
    Node prev = null;
    Node next; 

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;

      prev = curr;
      curr = next;
    }

    head = prev;
  }

  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();

    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.addLast(4);
    dll.addLast(5);

    dll.print(); // output:  1 <--> 2 <--> 3 <--> 4 <--> 5 <--> null
    System.out.println(dll.size); // output: 5

    dll.reverse();
    dll.print();// 5 <--> 4 <--> 3 <--> 2 <--> 1 <--> null

  }
}
