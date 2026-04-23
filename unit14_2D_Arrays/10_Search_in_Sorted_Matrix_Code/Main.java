
public class Main {

  public static int printCount(int array[][], int key) {  // complexty: O(n*m)
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] == key) {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int array[][] = {
      {4, 7, 8},
      {8, 8, 7}
    };
    int key = 7;

    System.out.println(printCount(array, key));
  }

}