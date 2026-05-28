# Find Permutations (Backtracking)

## Problem Statement

Find and print all permutations of a string:

```text
Input: "abc"
```

Output:

```text
abc, acb, bac, bca, cab, cba
```

---

# What is a Permutation?

A permutation means:

```text
Rearranging characters in all possible orders
```

Unlike subsets:
- Order matters in permutations

Example:
- "abc" ≠ "acb"

---

# Key Idea

At each step:
- Pick one character
- Remove it from the string
- Add it to answer
- Repeat for remaining characters

---

# Backtracking Concept

We:
```text
Choose → Explore → Undo (implicitly via new string)
```

But here:
- We don’t manually undo
- Because we create a new string every time

---

# Your Code

```java
public class Backtracking {

    public static void findPermutation(String str, String ans) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Recursion
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            String newStr =
                str.substring(0, i) + str.substring(i + 1);

            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        String str = "abc";

        findPermutation(str, "");
    }
}
```

---

# How It Works (Step-by-Step)

## Start:
```text
str = "abc", ans = ""
```

---

## Level 1 Choices:

Pick one character:
- a
- b
- c

---

## If we pick 'a':

Remaining string = "bc"

Now:
```text
ans = "a"
```

---

## Next level:

From "bc":
- b → then c
- c → then b

So:
- abc
- acb

---

## Similarly for 'b' and 'c'

We get:
- bac, bca
- cab, cba

---

# Recursion Tree Idea

```text
            ""
       /     |     \
      a      b      c
     / \    / \    / \
   bc  cb  ac  ca  ab  ba
```

---

# Why This is Backtracking?

Because:
- We explore one path fully
- Then return and try another path

Pattern:

```text
Pick → Recurse → Try next choice
```

Even though we don't explicitly "undo", the function stack naturally backtracks.

---

# Key Difference from Subsets

| Feature | Subsets | Permutations |
|---|---|---|
| Order matters | ❌ | ✅ |
| Choice type | include/exclude | pick any element |
| Result count | 2ⁿ | n! |
| String handling | add only | remove + add |

---

# Time Complexity

For permutations:

`O(n!)`

Because:
- First position: n choices
- Second: n-1 choices
- Third: n-2 choices
- ...

---

# Space Complexity

`O(n)`

(for recursion stack)

---

# Important Concept

This line is the heart of permutation:

```java
String newStr = str.substring(0, i) + str.substring(i + 1);
```

It means:
- Remove chosen character
- Reduce problem size


# Final Output

```text
abc
acb
bac
bca
cab
cba
```

