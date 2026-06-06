# First Non-Repeating Letter in a Stream

## Problem Statement

Given a stream of characters, print the **first non-repeating character** at each step.

If no such character exists, print:

    -1

---

## Example

### Input:

    aabccxb

### Output:

    a -1 b b b b x

---

## Idea / Approach

We need to process characters one by one and at every step determine:

> Which character is the first one that has NOT repeated so far?

To solve this efficiently, we use:

- A **Queue** → to maintain order of characters
- A **Frequency Array** → to track how many times each character appears

---

## Why Queue?

Queue helps maintain:

    FIFO order (First In First Out)

So the front of the queue always represents the **oldest character**.

---

## Why Frequency Array?

We need to quickly check:

    Has this character appeared more than once?

So we use:

    freq[character]

For lowercase English letters:

    'a' → 'z' → freq[26]

---

## Data Structures Used

### Queue

    Queue<Character> q = new LinkedList<>();

Stores characters in order of arrival.

---

### Frequency Array

    int freq[26];

Tracks count of each character.

---

## Algorithm Steps

For each character in the string:

---

### Step 1: Add character to queue

    q.add(ch);

---

### Step 2: Update frequency

    freq[ch - 'a']++;

---

### Step 3: Remove repeating characters from front

While:

- Queue is not empty
- AND front character frequency > 1

Then remove it:

    while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)
        q.remove();

---

### Step 4: Print result

If queue is empty:

    print -1

Else:

    print q.peek()

---

## Dry Run

Input:

    a a b c c x b

---

### Step-by-step:

#### 1. a

Queue:
    a

Output:
    a

---

#### 2. a

Queue:
    a a

Both repeated → removed

Output:
    -1

---

#### 3. b

Queue:
    b

Output:
    b

---

#### 4. c

Queue:
    b c

Output:
    b

---

#### 5. c

Remove c

Queue:
    b

Output:
    b

---

#### 6. x

Queue:
    b x

Output:
    b

---

#### 7. b

b becomes repeated → removed

Queue:
    x

Output:
    x

---

## Final Output

    a -1 b b b b x

---

## Time Complexity

Each character is:

- Added once
- Removed at most once

So:

    O(n)

---

## Space Complexity

We use:

- Queue → O(n)
- Frequency array → O(26)

Total:

    O(n)

---

## Key Insight

The solution works because:

- Queue maintains order of arrival
- Frequency array ensures we remove duplicates
- Front of queue always gives the first valid non-repeating character

---

## Important Pattern

This problem follows a common pattern:

    Stream + Queue + Frequency Tracking

Used in:

- First non-repeating character
- Sliding window variations
- Real-time processing problems

---

## Edge Cases

### 1. All characters repeating

Input:

    aabbcc

Output:

    a -1 -1 -1 -1 -1

---

### 2. All unique characters

Input:

    abcd

Output:

    a a a a

---

### 3. Single character

Input:

    a

Output:

    a

---

## Key Takeaways

- Queue is used for order maintenance
- Frequency array is used for quick lookup
- Repeated characters are removed from the front
- Each character is processed only once
- Final complexity is O(n)

---

## Interview Tip

Be ready to explain:

- Why queue is needed
- Why frequency array is required
- Why we remove only from front
- How each element is processed only once