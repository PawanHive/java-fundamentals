/*
Circular Queues using Arrays

because of Circular Queues using Array, remove() method can solve in O(1) time complexity now, 

isEmpty() -- O(1)
add() -- O(1)
remove() -- O(1)
peek() -- O(1) 

now here all solve in O(1) time complexity
*/


public class Queues {
  static class Queue {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    // constructor function
    Queue(int n) {
      arr = new int[n];
      size = n;
      rear = -1; // means queue is empty;
      front = -1;
    }

// ------------------------------------ isEmpty() -- O(1) ---------------------------------------------------
    public static boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    public static boolean isFull() {
      return (rear+1) % size == front; // REMEMBER: this formula
    }

// ----------------------------------------- add() -- O(1) -------------------------------------------------
    public static void add(int data) {
      // is queue is full or not
      if(isFull()) {
        System.out.println("Queue is full");
        return;
      }
      // add 1st element
      if(front == -1) {
        front = 0;
      }

      rear = (rear + 1) % size;
      arr[rear] = data;
    }

// ----------------------------------------- remove() -- O(1) -------------------------------------------------
    public static int remove() {
      if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }

      int result = arr[front];
      // llast element delete
      if(rear == front) {
        rear = front = -1;
      } else {
        front = (front + 1) % size;
      }
      
      return result;
    }

// ----------------------------------------- peek() -- O(1) -------------------------------------------------
    public static int peek() {
      if(isEmpty()) {
        System.out.println("empty queue");
        return -1;
      }
      
      return arr[front];
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue(3);
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.remove());
    q.add(4);
    System.out.println(q.remove());
    q.add(5);

    // print 
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
    
  }
}
