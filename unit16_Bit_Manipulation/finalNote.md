# 📘 Bit Manipulation + Fast Exponentiation Notes

---

# 🧠 1. Binary Basics

- Decimal → Binary: divide by 2 repeatedly
- Binary → Decimal: sum of powers of 2
- LSB → rightmost bit (decides odd/even)
- MSB → leftmost bit (sign in signed numbers)

---

# 🔥 2. Bitwise Operators

## AND (&)
~~~java
1 & 1 = 1
else = 0
~~~

## OR (|)
~~~java
If any bit is 1 → result = 1
~~~

## XOR (^)
~~~java
Same → 0
Different → 1

a ^ a = 0
a ^ 0 = a
~~~

## NOT (~)
~~~java
~n = -(n + 1)
~~~

## Left Shift (<<)
~~~java
n << k = n * 2^k
~~~

## Right Shift (>>)
~~~java
n >> k = n / 2^k
~~~

---

# 🧠 3. Basic Bit Tricks

## Check Odd/Even
~~~java
if ((n & 1) == 0) → even
else → odd
~~~

---

## Get ith Bit
~~~java
(n >> i) & 1
~~~

---

## Set ith Bit
~~~java
n | (1 << i)
~~~

---

## Clear ith Bit
~~~java
n & ~(1 << i)
~~~

---

## Toggle ith Bit
~~~java
n ^ (1 << i)
~~~

---

## Update ith Bit
~~~java
n = n & ~(1 << i)
n = n | (newBit << i)
~~~

---

# 🧠 4. Bit Masking

## Single Bit Mask
~~~java
1 << i
~~~

---

## Right Mask (last i bits)
~~~java
(1 << i) - 1
~~~

---

## Clear Last i Bits
~~~java
n & (~0 << i)
~~~

---

## Clear Range (i to j)
~~~java
n & ((~0 << (j+1)) | ((1 << i) - 1))
~~~

---

# 🧠 5. Count Set Bits

## Basic Method
~~~java
int count = 0;
while (n > 0) {
  if ((n & 1) == 1) count++;
  n = n >> 1;
}
~~~

---

## Optimized Method
~~~java
int count = 0;
while (n > 0) {
  n = n & (n - 1);
  count++;
}
~~~

---

# 🔁 6. Swap Without Extra Variable

## XOR Method
~~~java
a = a ^ b;
b = a ^ b;
a = a ^ b;
~~~

---

# ⚡ 7. Fast Exponentiation

~~~java
int result = 1;

while (n > 0) {
  if ((n & 1) != 0)
    result *= a;

  a *= a;
  n >>= 1;
}
~~~

Time Complexity: O(log n)

---

# 🔥 8. Modular Exponentiation

## Formula
~~~java
(a^n) % m
~~~

## Property
~~~java
(a * b) % m = ((a % m) * (b % m)) % m
~~~

## Code
~~~java
int result = 1;

while (n > 0) {
  if ((n & 1) != 0)
    result = (result * a) % m;

  a = (a * a) % m;
  n >>= 1;
}
~~~

Time Complexity: O(log n)

---

# 🧠 Key Intuition

- Binary = powers of 2
- Bit mask = control specific bits
- AND → check/filter
- OR → set
- XOR → toggle
- Shift → fast multiply/divide
- Fast expo → reduce operations
- Modular expo → avoid overflow

---


## Check if Number is Power of 2

~~~java
if ((n & (n - 1)) == 0 && n > 0)
    → power of 2
~~~

### Why?
- Power of 2 has only ONE set bit
- n & (n-1) removes last set bit
- If result = 0 → only one bit was present
---