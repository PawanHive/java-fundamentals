import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<Boolean> list2 = new ArrayList<>();

    // ADD element in ArrayList -- Time Complexity: O(1)
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list); // output: [1, 2, 3, 4]

    // ADD element at SPECIFIC index in ArrayList -- Time Complexity: O(n)
    list.add(1, 9);
    
    System.out.println(list); //output: [1, 9, 2, 3, 4]

    // GET element from ArrayList -- Time Complexity: O(1)
    int element = list.get(2);
    System.out.println(element);

    // REMOVE(delete) element from ArrayList -- Time Complexity: O(n)
    list.remove(2); // element of 2nd index will DELETE
    System.out.println(list);

    // SET(update/replace) existing element from ArrayList -- Time Complexity: O(n)
    list.set(2, 10);
    System.out.println(list);

    // CONTAINS element EXISTS or NOT in ArrayList (TRUE or FALSE) -- Time Complexity: 
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));
  }
}
