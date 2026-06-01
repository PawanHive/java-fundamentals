/*
Doubly Linked List
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

// -----------------------------------removeFirst() operation in Doubly LL -----------------------------------

  public int removeFirst() {
    if(head == null) {
      System.out.println("DLL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }

    int val = head.data; 
    head = head.next;
    head.prev = null;
    size--;
    return val;
  }
  
// -----------------------------------removeLast() operation in Doubly LL -----------------------------------
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

  int val = tail.data; // tail.data
  tail = tail.prev;
  tail.next = null;
  size--;
  return val;
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

  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();

    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.addLast(4);
    dll.addLast(5);

    dll.print(); // output:  1 <--> 2 <--> 3 <--> 4 <--> 5 <--> null
    System.out.println(dll.size); // output: 5

    dll.removeFirst();
    dll.print(); // output: 2 <--> 3 <--> 4 <--> 5 <--> null
    System.out.println(dll.size); // output: 4

    dll.removeLast(); 
    dll.print(); //output: 2 <--> 3 <--> 4 <--> null
    System.out.println(dll.size); // output: 3

  }
}
