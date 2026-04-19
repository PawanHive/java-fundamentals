

public class Main {

  public static void reverse(int numbers[]) {
    int first = 0, last = numbers.length-1;  // here 'first' represent 'firstIndex' and 'last' represent 'lastIndex'

    while (first < last) {
      //using SWAP - technique
      int temp = numbers[last];
      numbers[last] = numbers[first];
      numbers[first] = temp;

      first++; // index no. will increase which make run this loop on different different position
      last--; // index no. will decrease which make run this loop on different different position
    }
  }
  public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10};

    reverse(numbers);

    // print reverse array;
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
  }
}
