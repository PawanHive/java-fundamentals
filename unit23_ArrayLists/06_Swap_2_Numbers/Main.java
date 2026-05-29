/*
Swap 2 Numbers

list 2, 5, 9, 3, 6
index: idx1 = 1, idx 2 = 3

output we want: 2, 3, 9, 5, 6
*/

import java.util.ArrayList;

// ------------------------- HOW I SOLVED (bad approach) --------------------------------------------

// public class Main {
//   public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();

//     list.add(2);
//     list.add(3);
//     list.add(9);
//     list.add(5);
//     list.add(6);

//     int temp;

//     temp = list.get(1);
//     list.set(1, 5);
//     list.set(3, 3);

//     System.out.println(list); // output: [2, 5, 9, 3, 6]
//   }
// }


// ----------------------------- TEACHER SOLUTION ----------------------------------

public class Main {
  public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(3);
    list.add(9);
    list.add(5);
    list.add(6);

    int idx1 = 1, idx2 = 3;

    System.out.println(list); // list before swap
    swap(list, idx1, idx2);
    System.out.println(list); // list after swap
  }
}