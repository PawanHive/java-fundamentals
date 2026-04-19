

public class Main {

  public static void update(int marks[], int nonChangeable) {
    for ( int i = 0; i < marks.length; i++) {
      nonChangeable = 10; // updating to from 5 to 10 but it will not work
      marks[i] = marks[i] + 1;
    }
  }
  
  
  public static void main(String[] args) {
    int marks[] = {97, 98, 99};
    int nonChangeable = 5;
    update(marks, nonChangeable);

    System.out.println("value of nonChangeable : " + nonChangeable);

    for ( int i = 0; i < marks.length; i++) {
      System.out.print(marks[i] + " ");
    }

    System.out.println();
  }
}
