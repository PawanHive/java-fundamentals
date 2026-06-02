/*
STACK's BASIC OPERATIONS using Linked List
*/

public class Stacks {

  // Defining Linked List Nodes with this Node Class
  static class Node {
    int data; 
    Node next;

    // constructor
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  static class Stack { // class name should be "Stack"
    static Node head = null;

//------------------------------------------ isEmpty() -- TC: O(1) -------------------------------------------
    // check stack empty or not
    public static boolean isEmpty() {
      return head == null;
    }

//------------------------------------------ push() -- TC: O(1) -------------------------------------------

    // PUSH (add)
    public static void push(int data) {
      Node newNode = new Node(data);

      // if stack is empty
      if(isEmpty()) {
        head = newNode;
        return;
      }

      newNode.next = head;
      head = newNode;
      
    }

//------------------------------------------ pop() -- TC: O(1) -------------------------------------------

    // POP (delete)
    public static int pop() {
      // corner case
      if(isEmpty()) { // if stack is empty
        return -1;
      }

      int top = head.data; // REMEMEBER: HEAD of LinkedList will be Top element of the Stack not tail
      head = head.next; // remove actual head and nextNode will assigning as HEAD
      return top; // by convension we return that element when we delete any top element.
    }

//------------------------------------------ peek() -- TC: O(1) -------------------------------------------

    // PEEK (jhankna ki top element kounsa hai)
    public static int peek() {
      // corner case
      if(isEmpty()) { // if stack is empty
        return -1;
      }
      
      return head.data; // now here as we know head.data is our top element of Stack in Linked List
    }
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
  }
}
