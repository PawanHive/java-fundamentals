

public class Main1 {

  public static int linearSearch(String menu[], String strKey) {
    for (int i = 0; i < menu.length; i++) {
      if (menu[i].equals(strKey)) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    String menu[] = {"dosa", "chole bhature", "samosa", "break", "pakauda"};
    String strKey = "samosa";

    int index = linearSearch(menu, strKey);
    if (index == -1) {
      System.out.println("Not found");
    } else {
      System.out.println("strKey is at index:  " + index);
    }

  }
}
