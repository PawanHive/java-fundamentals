/*
Find Maximum in an ArrayList
list = 2, 5, 9, 3, 6
output we want: 9
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);

    // Print Maximum element -- Time Complexity: 
    int max = Integer.MIN_VALUE;
    
    for (int i=0; i<list.size(); i++) {
      if(list.get(i) > max) {
        max = list.get(i);
      }
    }

    System.out.println("Max element: " + max);
  }
}
