import java.util.*;

public class Main {
  public static void main(String[] args) {
    int marks[] = new int[100]; // size - 100
    
    // calculating length of arrays
    System.out.println("length of array = " + marks.length);

    Scanner sc = new Scanner(System.in);

    // taking input at array index.
    marks[0] = sc.nextInt(); // phy
    marks[1] = sc.nextInt(); // chem
    marks[2] = sc.nextInt(); // math

    System.out.println("phy : " + marks[0]);
    System.out.println("chem : " + marks[1]);
    System.out.println("math : " + marks[2]);


    // calculate percentage
    int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    System.out.println("percentage = " + percentage + "%");

    // updating math marks
    marks[2] =  100;
    System.out.println("math : " + marks[2]);

    // updating phy marks by 1
    marks[0] = marks[0] + 1;
    System.out.println("phy : " + marks[0]);

  }
}
