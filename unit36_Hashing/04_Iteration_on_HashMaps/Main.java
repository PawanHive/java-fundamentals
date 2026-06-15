import java.util.HashMap;
import java.util.Set;


public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    hm.put("Indonesia", 6);
    hm.put("Nepal", 5);

    // ---------------------------------Iteration_on_key--TC:O(1)------------------------------------------
    Set<String> keys = hm.keySet();
    System.out.println(keys); // output: [China, US, Nepal, India, Indonesia]

    // now print the value of all these keys: [China, US, Nepal, India, Indonesia]
    for (String k : keys) { // loop on their key set -- keys data
      System.out.println("key = " + k + ", value = " + hm.get(k));
    }
    /*
    output: 
    key = China, value = 150
    key = US, value = 50
    key = Nepal, value = 5
    key = India, value = 100
    key = Indonesia, value = 6
    */

  }
}
