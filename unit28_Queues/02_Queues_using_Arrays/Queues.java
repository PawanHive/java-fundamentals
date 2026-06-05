/*
Queues using Arrays

isEmpty() -- O(1)
add() -- O(1)
remove() -- O(n)
peek() -- O(1) 
*/


public class Queues {
  static class Queue {
    static int arr[];
    static int size;
    static int rear;

    // constructor function
    Queue(int n) {
      arr = new int[n];
      size = n;
      rear = -1; // means queue is empty;
    }

// ------------------------------------ isEmpty() -- O(1) ---------------------------------------------------
    public static boolean isEmpty() {
      return rear == -1;
    }

// ----------------------------------------- add() -- O(1) -------------------------------------------------
    public static void add(int data) {
      // is queue is full or not
      if(rear == size-1) {
        System.out.println("Queue is full");
        return;
      }
      rear = rear + 1;
      arr[rear] = data;
    }

// ----------------------------------------- remove() -- O(n) -------------------------------------------------
    public static int remove() {
      if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }

      int front = arr[0];
      // shift each rear element one step ahead
      for(int i=0; i<rear; i++) {
        arr[i] = arr[i+1];
      }
      rear = rear - 1; // all element will shift one step ahead
      return front;
    }

// ----------------------------------------- peek() -- O(1) -------------------------------------------------
    public static int peek() {
      if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      
      return arr[0];
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);

    // print 
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
    
  }
}
