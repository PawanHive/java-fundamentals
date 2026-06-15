import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create HashMap : here 'key' will be 'String' and 'value' will be 'Integer'
    HashMap<String, Integer> hm = new HashMap<>();

    // ------------------------------put()--insert--TC:O(1)--------------------------------------------------------
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);

    System.out.println(hm); // output: {China=150, US=50, India=100}
    
    // ------------------------------get()--TC:O(1)--------------------------------------------------------
    int population = hm.get("India");
    System.out.println(population); // output: 100

    // return null because it is invalid key
    System.out.println(hm.get("Indonesia")); // output: null
    

    // -------------------------------ContainsKey()--(key_exist_or_not)--TC:O(1)-------------------------------------------
    System.out.println(hm.containsKey("India")); // output: true
    System.out.println(hm.containsKey("Indonesia")); // output: false

    // -------------------------------remove()--(delete_key:v{US=50, India=100}alue_both)--TC:O(1)-----------------------------------
    System.out.println(hm.remove("China")); 
    System.out.println(hm); // output: {US=50, India=100}

    // -----------------------------------------------size()--TC:O(1)----------------------------------------------------
    System.out.println(hm.size());  // output: 2
    
    // -------------------------------------------isEmpty()--TC:O(1)--------------------------------------------------------
    System.out.println(hm.isEmpty()); // output: false;

    // ---------------------------------------------clear()-----------------------------------------------------------------------
    hm.clear(); // delete all data
    System.out.println(hm.isEmpty()); // output: true

  }
}
