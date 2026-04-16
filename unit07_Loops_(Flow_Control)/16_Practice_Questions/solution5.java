

public class solution5 {
  public static void main(String[] args) {
    for(int i = 0; i <= 5; i++) {
      System.out.println("i = " + 1);
    }
    
    // System.out.println("i after the loop = " + i);
  }
}


/*
You printed " + 1" instead of i, so it always prints 1 instead of loop values.
i is declared inside the loop, so you cannot use it outside (scope error).
*/