# Code: 
```java


public class Main {

  //is number prime or not?
  // Prime Number definition: A prime number has exactly 2 factors: 1 and itself;

  // only for n >= 2
  public static boolean isPrime(int n) {
    // corner cases //2
    if(n == 2) {
      return true;
    }

    for(int i = 2; i <= n-1; i++) { // if n=5, then check from 2-4, if n=10, then check from 2-9.
      if(n % i == 0) { //completely dividing
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    System.out.println(isPrime(5));
  }
}

```

# Dry Run of `isPrime(5)`

## Method Call

```java
main() → isPrime(5)  →  n = 5
```


# Step 1 — Corner Case Check

```java
n == 2?  →  5 == 2?  →  false  →  skip return
```

# Step 2 — For Loop

Loop:

**Condition: `i <= n-1` → `i <= 4`**

## Iteration Table

| Iteration | i | Condition `i <= 4` | `5 % i == 0 ?` | Result | Action |
|---|---|---|---|---|---|
| 1st | 2 | ✅ Yes | `5 % 2 = 1` | Not divisible | Continue |
| 2nd | 3 | ✅ Yes | `5 % 3 = 2` | Not divisible | Continue |
| 3rd | 4 | ✅ Yes | `5 % 4 = 1` | Not divisible | Continue |
| 4th | 5 | ❌ No | — | Loop ends | Stop |

---

# Step 3 — Return Statement

No divisor found → return `true`

# Output

true  ✅  (5 is a Prime number)

# Why is 5 Prime?
5 has no factors between `2` and `4` that divide it completely, so it has exactly 2 factors: `1` and `5` → ✅ `Prime`