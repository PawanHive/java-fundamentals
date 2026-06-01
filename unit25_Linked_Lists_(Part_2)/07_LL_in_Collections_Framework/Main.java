import java.util.LinkedList; // this is LinkedList Collections Framework

public class Main {
  public static void main(String[] args) {
    // create 
    LinkedList<Integer> ll = new LinkedList<>();

    // ADD:
    // HERE, addLast(), addFirst() these are built-in method of LinkedList Collections Framework
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);

    System.out.println(ll); // output: [0, 1, 2]

    // REMOVE:
    //HERE, removeLast(), removeFirst() these are also built-in method of LinkedList Collections framework
    ll.removeLast();
    ll.removeFirst();

    System.out.println(ll); // output: [1]
  }
}
