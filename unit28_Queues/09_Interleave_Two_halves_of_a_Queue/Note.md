# Interleave Two Halves of a Queue

## Problem Statement

Given a queue of **even length**, rearrange its elements such that the two halves are interleaved.

---

### Example

#### Input:

    1 2 3 4 5 6 7 8 9 10

#### Output:

    1 6 2 7 3 8 4 9 5 10

---

## Idea / Approach

We split the queue into two halves:

- First half → elements from front
- Second half → remaining elements

Then we **interleave both halves one by one**.

---

## Why This Works

We maintain original order in both halves and then combine them like:

    firstHalf[0], secondHalf[0],
    firstHalf[1], secondHalf[1], ...

This preserves relative ordering while mixing both halves.

---

## Data Structures Used

We use:

- Original Queue → `q`
- Auxiliary Queue → `firstHalf`

---

## Step-by-Step Algorithm

---

### Step 1: Find size of queue

    int size = q.size();

We store size because queue size changes during operations.

---

### Step 2: Move first half into auxiliary queue

We move first `size/2` elements into `firstHalf`.

```java id="step1"
for (int i = 0; i < size / 2; i++) {
    firstHalf.add(q.remove());
}
```

---

### Example after Step 2

Input:

    q = [1 2 3 4 5 6 7 8 9 10]

After split:

    firstHalf = [1 2 3 4 5]
    q         = [6 7 8 9 10]

---

## Step 3: Interleave both queues

Now we alternate elements from both queues.

---

### Logic

Repeat until `firstHalf` becomes empty:

1. Take one element from `firstHalf`
2. Take one element from `q`

---

### Code Logic

```java id="step2"
while (!firstHalf.isEmpty()) {
    q.add(firstHalf.remove());
    q.add(q.remove());
}
```

---

## Dry Run

### Initial state

    q = [1 2 3 4 5 6 7 8 9 10]

---

### After splitting

    firstHalf = [1 2 3 4 5]
    q         = [6 7 8 9 10]

---

### Interleaving process

#### Iteration 1

    q → add 1 → [6 7 8 9 10 1]
    q → move 6 → [7 8 9 10 1 6]

---

#### Iteration 2

    q → add 2 → [7 8 9 10 1 6 2]
    q → move 7 → [8 9 10 1 6 2 7]

---

#### Continue...

Final Queue:

    [1 6 2 7 3 8 4 9 5 10]

---

## Time Complexity

### Splitting step:

    O(n)

### Interleaving step:

    O(n)

### Total:

    O(n)

---

## Space Complexity

We use an extra queue:

    O(n/2) → O(n)

---

## Important Observations

- Queue size must be even
- Order inside each half is preserved
- Only rearrangement is done, no element is lost
- Uses FIFO property of queue

---

## Edge Cases

### 1. Even size (valid case)

    2 4 6 8 → Works correctly

---

### 2. Odd size (invalid / undefined)

Example:

    1 2 3 4 5

Possible handling:

- ignore middle element OR
- leave it at end

(Depends on problem statement)

---

## Why We Store Size Initially

Because:

- Queue size changes during removal
- Direct `q.size()` inside loop would give incorrect results

So:

    int size = q.size();

is critical.

---

## Key Insight

We simulate interleaving by:

- Splitting queue into two halves
- Alternating elements from both halves
- Reconstructing original order in mixed form

---

## Pattern Recognition

This problem belongs to:

- Queue manipulation
- Two-pointer style simulation
- Auxiliary data structure usage

---

## Key Takeaways

- Split queue into two halves
- Use extra queue for first half
- Alternate merging from both queues
- Maintain O(n) efficiency
- Preserve relative order of elements

---

## Interview Tip

Be ready to explain:

- Why splitting is needed
- Why we store size beforehand
- How interleaving maintains order
- Why queue is suitable for this problem