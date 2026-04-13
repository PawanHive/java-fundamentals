

public class Main {
  public static void main(String[] args) {

    // Type conversion (byte → short → char → int → long(8b) → float(4b) → double)

    // NOT allowed
    float a = 45.234f;
    int b = (int) a; // going from bigger data type -> smaller data type. (so we explicitly saying to convert)
    System.out.println(b);

    // allowed
    char ch = 'a';
    char ch2 = 'b';
    int number = ch; //output: 97
    int number2 = ch2; //output: 98
    System.out.println(number);
    System.out.println(number2);
  }
}
