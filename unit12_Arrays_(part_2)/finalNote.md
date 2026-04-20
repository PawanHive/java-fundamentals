# #1: Max subarray sum 1 (Brute Force)

## 📌 Problem Statement
Given an array, find the **maximum sum of any contiguous subarray**.

---

## 🧠 Concept
- A **subarray** is a continuous part of an array  
- We generate all subarrays and calculate their sums  
- Track the **maximum sum**

---

## ⚙️ Algorithm (Brute Force)

1. Fix starting index `i`
2. Fix ending index `j`
3. Calculate sum from `i` to `j`
4. Compare with `maxSum`
5. Repeat for all subarrays

---

# ------------------------------------------------------------------------------------------------------

# #2: Max subarray sum 2 (Prefix Sum) 

## 📌 Problem Statement
Given an array, find the **maximum sum of any contiguous subarray**.

---

## 🧠 Idea (Prefix Sum Approach)
Instead of recalculating sum for every subarray from scratch, we use a **prefix array** to get subarray sum in O(1).

👉 This reduces brute force from **O(n³) → O(n²)**

---

## ⚙️ Prefix Sum Concept

### Prefix Array Definition:
```
prefix[i] = sum of elements from index 0 to i
```

### Subarray Sum Formula:

If subarray is from `start` to `end`:

- If start = 0:
```
sum = prefix[end]
```

- If start > 0:
```
sum = prefix[end] - prefix[start - 1]
```

---

# -------------------------------------------------------------------------------------------------------

# #3: Max Subarray Sum 3 (Kadane's algorithm) 

## 📌 Problem Statement
Given an integer array, find the **maximum sum of a contiguous subarray**.

---

## 🧠 Idea (Kadane’s Algorithm)

At each step, we maintain a running sum of the subarray.

👉 If the running sum becomes negative, we reset it to zero because a negative sum will reduce the total sum of any future subarray, so it is better to start fresh from the next element.

We track:
- `cs` → current sum  
- `ms` → maximum sum so far  


---

## ⚙️ Key Concept

At every step:
```
cs = cs + arr[i]
```

If `cs` becomes negative:
```
cs = 0
```

We update:
```
ms = max(ms, cs)
```

---

# -------------------------------------------------------------------------------------------------------
# #5: Trapping Rainwater Code

## 📌 Problem Statement
Given an array `height[]` representing elevation heights,  
find how much **rainwater can be trapped** between the bars.

---

## 🧠 Idea

Water trapped at any index depends on:
- Maximum height on the **left**
- Maximum height on the **right**

👉 Water level at index `i`:
```
min(leftMax[i], rightMax[i])
```

👉 Trapped water:
```
waterLevel - height[i]
```

---

## ⚙️ Algorithm (Prefix Max Approach)

1. Create `leftMax[]`:
   - `leftMax[i] = max(height[0] → height[i])`

2. Create `rightMax[]`:
   - `rightMax[i] = max(height[i] → height[n-1])`

3. Traverse array:
   - waterLevel = min(leftMax[i], rightMax[i])
   - trappedWater += waterLevel - height[i]

---
# -------------------------------------------------------------------------------------------------------

# #6: Best time to buy and sell stock:

## 📌 Problem Statement
Given an array where `prices[i]` represents the stock price on day `i`,  
find the **maximum profit** you can achieve by:

👉 Buying on one day  
👉 Selling on a later day  

You can perform **only one transaction**.

---

## 🧠 Idea

- Keep track of the **minimum buying price so far**
- At each day, calculate potential profit
- Update the **maximum profit**

---

## ⚙️ Algorithm

1. Initialize:
   - `buyPrice = ∞` (Integer.MAX_VALUE)
   - `maxProfit = 0`
2. Traverse the array:
   - If current price < buyPrice → update buyPrice
   - Else → calculate profit = price - buyPrice
   - Update maxProfit
3. Return maxProfit

---