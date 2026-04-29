
public class OOPS7 {

  public static void main(String[] args) {
    Test t = new Test();
    t.set_marks(98);
    System.out.println(Test.marks); // REMEMBER:  here we can acces mark using 'Test.marks' because marks varialble is static so it can access with class name.
  }
}

class Test{
  static int marks;
  void set_marks(int marks) {
    this.marks = marks;
  }
}

