import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
  public static void main(String[] args) {

    // using LinkedHashMap -- give output in as order of insertion
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("India", 100);
    lhm.put("China", 150);
    lhm.put("US", 50);

    System.out.println(lhm);


    // ussing HashMap
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);

    System.out.println(hm);
  }
}
