# #7: Spiral Matrix 

## 📌 Problem Statement
Given a 2D matrix, print all elements in **spiral order (clockwise)**.

---

## 🧠 Idea

We traverse the matrix layer by layer using boundaries:

- `startRow` → top row
- `endRow` → bottom row
- `startCol` → left column
- `endCol` → right column

👉 In each loop, we print:
1. Top boundary (left → right)
2. Right boundary (top → bottom)
3. Bottom boundary (right → left)
4. Left boundary (bottom → top)

Then we shrink the boundaries inward.

---

## ⚙️ Algorithm

1. Initialize:
   - `startRow = 0`
   - `startCol = 0`
   - `endRow = n - 1`
   - `endCol = m - 1`

2. While `startRow <= endRow` AND `startCol <= endCol`:
   - Print top row
   - Print right column
   - Print bottom row (if valid)
   - Print left column (if valid)
   - Shrink boundaries

---