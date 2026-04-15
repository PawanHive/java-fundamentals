# #1: Ternary Operator:

```text
variable =  condition ? statement1(true wala) : statment2(false wala);
```

**Example:**

```java
public class Main {
  public static void main(String[] args) {
    
    int number = 4;

    // ternary operator
    String type = (number%2 == 0)  ? "even" : "odd";
    System.out.println(type);
  }
}
```

# #2: Switch Statment:

```text
switch(variable) {
  case 1:

  case 2:

  case 3:

  case 4:
}
```

**Example:**
```jaav
public class Main {
  public static void main(String[] args) {
    int number = 2;
    switch(number) {
      case 1: System.out.println("samosa");
      break;
      case 2: System.out.println("burger");
      break;
      case 3: System.out.println("mango shake");
      break;
      default: System.out.println("we wake up");
    }
  }
}
```