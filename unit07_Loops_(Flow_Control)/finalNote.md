# #1: While Loop

```text 
initialization
while (condition) {
    // code to be executed
  updation;
}
```
**Example:**
```java
public class Main {
  public static void main(String[] args) {

    // print "hello world" 100times
    int counter = 0;

    while (counter < 100) {
      System.out.println("Hello World");
      counter ++;
    }

    System.out.println("Printed HW 100x");
  }

}
```

# #2: for loop

**Syntax**
```text
for (initialisation; condition; updation) {
  // do something
}

**Example:**
```java
public class Main {
  public static void main(String[] args) {
        
    for(int i = 1; i <= 5; i++) {
      System.out.println("Hello world");
    }
  }
}
```

# #3: do while looo

**Syntax:**
```text
public class Main {
  public static void main(String[] args) {
    initialisation;

    do {
      // do something
    } while (condition);
  }
}
```
**Example:**
```java
public class Main {
  public static void main(String[] args) {
    int counter = 1;

    do {
      System.out.println("Hello World");
      counter++;
    } while (counter <= 10);
  }
}
```