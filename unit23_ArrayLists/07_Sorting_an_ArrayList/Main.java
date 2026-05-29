import java.util.ArrayList;
import java.util.Collections;

/*
Remember: 
Collections ==> class
collection ==> interface
*/

public class Main {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(3);
    list.add(9);
    list.add(5);
    list.add(6);

    System.out.println(list); // print actual arraylist

    Collections.sort(list);  // ASCENDING ORDER // it is in-build optimized sorting way of java
    System.out.println(list);  // print after .sort()

    // DESCENDING ORDER
    Collections.sort(list, Collections.reverseOrder()); // .reverseOrder() is a Comparator - fnx logic ...we can apply it on Array, or Object also
    System.out.println(list); // print after reverseOrder()
  }
}
