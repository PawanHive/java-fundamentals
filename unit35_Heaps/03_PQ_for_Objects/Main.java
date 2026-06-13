/*
Priority Queue for Objects
*/

import java.util.PriorityQueue;

public class Main {
  // this is how to compare objects of class :  REMEMBER IT:
  static class Student implements Comparable<Student> { // it will make class object comparable
    String name;
    int rank;

    public Student (String name, int rank) {
      this.name = name;
      this.rank = rank;
    }

    @Override
    public int compareTo (Student s2) {// means we will compare according to rank
      return this.rank - s2.rank;
    }
  }
  public static void main(String[] args) {
    // 1,  2, 3, 4, 5
    PriorityQueue<Student> pq = new PriorityQueue<>();

    pq.add(new Student("A", 4));
    pq.add(new Student("B", 5));
    pq.add(new Student("C", 2));
    pq.add(new Student("D", 12));


    while(!pq.isEmpty()) {
      System.out.println(pq.peek().name + " --> " + pq.peek().rank);
      pq.remove();
    }
  }

}


/*
output: 

C --> 2
A --> 4
B --> 5
D --> 12
*/