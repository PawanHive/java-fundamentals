

public class Main {
  public static void main(String[] args) {
    char a = 'a';
    char b = 'b';
    System.out.println((int)(b));// 98
    System.out.println((int)(a)); // 97
    System.out.println(b-a); // output: 1  (during expression java convert byte, short, char to int automatially)

    // all convert to int (in expression)
    short c = 5;
    byte d = 25;
    char e = 'c';
    // byte bt = a + b + c; // error possibley lossy conversion from int to byte (because of express all different data types converted in to 'int')
    byte bt = (byte) (a + b + c);
    System.out.println(bt); // -56

    // all covert to bigger data type (in expression automatically)
    int k = 10;
    float l = 20.25f;
    long m = 234;
    double n = 30;
    //int ans = k + l + m + n; // error: possible lossy conversion from double to int (means they automatically converted to biggest data types found in expression which i 'double' in this case)
    double ans = k + l + m + n; 
    System.out.println(ans);// output 294.25


    // // Wrong approach:
    // byte f = 5;
    // f = f * 2;

    // // another wrong approach: 
    // byte g = 5;
    // byte h = g * 2;

    // right 
    byte i = 5;
    byte j = (byte)(b * 2);
    System.out.println(j); // -60


  }
}
