import java.util.*;

public class OOPS {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.schoolName = "JMV";

    Student s2 = new Student();
    System.out.println(s2.schoolName); // even 's2' object print the same value of 'schoolName'

    Student s3 = new Student();
    s3.schoolName = "ABC"; // now current value of 'schoolName' is "ABC" and this new changed happen for every objects like s1, s2
    System.out.println(s3.schoolName);
  }
}

class Student {

  // static function
  static int percentage(int math, int phy, int chem) { // because of 'static' keyword this function will create only one time in a memory and will be same for any OBJECTS
    return (math + phy + chem) / 3;
  }

  String name;
  int roll;

  // static variable
  static String schoolName; // this will same and static, even for different OBJECTS // if this static variable changed by any object then will reflect same for every object. and this variable will create only one time

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
}