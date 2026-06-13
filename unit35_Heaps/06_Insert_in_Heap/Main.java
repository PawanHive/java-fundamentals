
import java.util.ArrayList;

public class Main {

  static class Heap {

    ArrayList<Integer> arr = new ArrayList<>();

    // ------------------------------------add()-into-Heap-------------------------------------------------
    public void add(int data) { // TC : O(log n)
      // ArrayList always add at last index
      arr.add(data);

      int x = arr.size() - 1; // x is a child index
      int par = (x - 1) / 2; // parent index

      // until child < parent
      while (arr.get(x) < arr.get(par)) { // TC : O(log n)
        // swap
        int temp = arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);

        x = par;
        par = (x - 1) / 2;
      }
    }
  }

  public static void main(String[] args) {

  }
}
