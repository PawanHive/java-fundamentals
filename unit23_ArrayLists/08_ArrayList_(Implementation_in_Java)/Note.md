# ArrayList Implementation in Java (Short Summary)

## What is ArrayList internally?

In Java, `ArrayList` is a **dynamic array** built on top of a normal array.

It internally uses:
- An array (`Object[]`)
- A size variable
- A capacity (extra space)

---

## Key Idea

- ArrayList is NOT truly dynamic
- It resizes the internal array when needed

---

## How it works

### 1. Normal case (space available)
- Elements are added directly into the array
- Time complexity: **O(1)**

---

### 2. When array becomes full
- A new larger array is created (usually **1.5x or 2x** size)
- Old elements are copied
- New element is added

This process is called **resizing**

---

## Time Complexity

| Operation | Complexity |
|---|---|
| get() | O(1) |
| set() | O(1) |
| add() (normal) | O(1) |
| add() (resize case) | O(n) |
| remove() | O(n) |

---

## Why add() is still O(1)?

Because resizing happens rarely → so average time = **Amortized O(1)**

---

## Main Internal Behavior

- Uses contiguous memory (like array)
- Grows automatically
- Shifts elements when inserting/removing in middle

---

## Key Points for Interview

- Built on array internally
- Grows dynamically (1.5x rule)
- Fast random access (O(1))
- Slow middle insert/delete (O(n))
- Best for read-heavy operations