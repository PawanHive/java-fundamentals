## Code snippet explained 

```java
import java.util.*;

public class Main {

  // Function to calculate factorial of a number
  // Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
  public static int factorial(int n) {

    // Store factorial result
    int f = 1;

    // Loop from 1 to n
    for(int i = 1; i <= n; i++) {

      // Multiply current value with i
      f = f * i;
    }

    // Return factorial of n
    return f;
  }

  // Function to calculate Binomial Coefficient
  // Formula:
  // nCr = n! / (r! * (n-r)!)
  public static int binCoeff(int n, int r) {

    // Calculate n!
    int fact_n = factorial(n);

    // Calculate r!
    int fact_r = factorial(r);

    // Calculate (n-r)!
    int fact_nmr = factorial(n-r);

    // Apply binomial coefficient formula
    int binCoeff = fact_n / (fact_r * fact_nmr);

    // Return final answer
    return binCoeff;
  }

  public static void main(String[] args) {

    // Print value of 5C2
    // 5C2 = 10        ---- "Five Choose two" = Ten         //It means, How many ways can we choose 2 items from 5 items?
    System.out.println(binCoeff(5, 2));
  }
}
```

## 📌 Example

If you have 5 students and you want to choose 2:

$$
\binom{5}{2} = \frac{5!}{2!(5-2)!} = \frac{120}{2 \times 6} = 10
$$

👉 So there are **10 ways**

---

## 🧠 Real-life understanding

Suppose:

- n = 3 (A, B, C)
- r = 2

Possible selections:

- AB  
- AC  
- BC  

👉 Answer = **3 ways**

# Binomial Coefficient (nCr)

## Pronunciation

`5C2` is pronounced as:

- **"Five choose two"**

---

## Meaning

It means:

> “How many ways can we choose 2 items from 5 items?”

---

## Formula

$$^5C_2 = \frac{5!}{2!(5-2)!} = \frac{120}{2 \times 6} = 10$$

---

## Examples

- `6C3` → “Six choose three”
- `10C4` → “Ten choose four”

---

## Important Note

This notation is called the **Binomial Coefficient**.