```java
/*
 * ============================================================
 *  COUNT UNIQUE SUBSTRINGS  (Trie)
 * ============================================================
 *
 *  PROBLEM STATEMENT:
 *  Ek lowercase string di gayi hai length n ki.
 *  Uske total DISTINCT substrings count karo.
 *
 * ------------------------------------------------------------
 *  EXAMPLE:
 * ------------------------------------------------------------
 *
 *  str = "ababa"
 *  ans = 10
 *
 *  All distinct substrings of "ababa":
 *  Length 1: "a", "b"                          → 2
 *  Length 2: "ab", "ba"                         → 2
 *  Length 3: "aba", "bab"                       → 2
 *  Length 4: "abab", "baba"                     → 2
 *  Length 5: "ababa"                            → 1
 *  Empty  :  ""  (counted as 1 in this approach)→ 1
 *                                          Total = 10  ✓
 *
 * ------------------------------------------------------------
 *  KEY INSIGHT:
 * ------------------------------------------------------------
 *
 *  Har substring, kisi na kisi suffix ka PREFIX hoti hai.
 *
 *  Example: str = "ababa"
 *  Suffixes:
 *    i=0 → "ababa"
 *    i=1 → "baba"
 *    i=2 → "aba"
 *    i=3 → "ba"
 *    i=4 → "a"
 *
 *  Agar in SABHI suffixes ko Trie mein insert karo,
 *  toh Trie mein total nodes ki count =
 *  total unique substrings ki count.
 *
 *  WHY?
 *  → Har node Trie mein ek unique path represent karta hai
 *    (root se us node tak) = ek unique substring.
 *  → Duplicate substrings same path share karenge
 *    (naya node nahi banega).
 *
 * ------------------------------------------------------------
 *  APPROACH:
 * ------------------------------------------------------------
 *
 *  Step 1: Har suffix (str[i...n-1]) ko Trie mein insert karo.
 *  Step 2: Insert karte waqt har NAYE node ke liye count++.
 *  Step 3: Final count + 1 (empty string ke liye) = answer.
 *
 * ------------------------------------------------------------
 *  DRY RUN:  str = "ababa"
 * ------------------------------------------------------------
 *
 *  Insert "ababa" → 5 new nodes: a→b→a→b→a   count = 5
 *  Insert "baba"  → b already nahi tha root se?
 *                   root→b (new), →a (new), →b(new), →a(new)
 *                   count = 5 + 4 = 9
 *  Insert "aba"   → root→a exists, →b exists, →a exists
 *                   0 new nodes                count = 9
 *  Insert "ba"    → root→b exists, →a exists
 *                   0 new nodes                count = 9
 *  Insert "a"     → root→a exists
 *                   0 new nodes                count = 9
 *
 *  Total nodes = 9
 *  Answer = 9 + 1 (empty string) = 10 ✓
 *
 * ------------------------------------------------------------
 *  JAVA IMPLEMENTATION:
 * ------------------------------------------------------------
 *
 *  class TrieNode {
 *      TrieNode[] children = new TrieNode[26];
 *  }
 *
 *  int countUniqueSubstrings(String str) {
 *      TrieNode root = new TrieNode();
 *      int count = 0;
 *
 *      // Har suffix insert karo
 *      for (int i = 0; i < str.length(); i++) {
 *          TrieNode curr = root;
 *
 *          // str[i] se last tak ka suffix insert karo
 *          for (int j = i; j < str.length(); j++) {
 *              int idx = str.charAt(j) - 'a';
 *
 *              if (curr.children[idx] == null) {
 *                  curr.children[idx] = new TrieNode();
 *                  count++;   // naya node = naya unique substring
 *              }
 *
 *              curr = curr.children[idx];
 *          }
 *      }
 *
 *      return count + 1;  // +1 for empty string ""
 *  }
 *
 * ------------------------------------------------------------
 *  WHY count + 1?
 * ------------------------------------------------------------
 *
 *  Empty string "" bhi ek valid substring consider hoti hai
 *  (root node represent karta hai use).
 *  Trie mein root ko count nahi kiya, isliye +1.
 *
 *  Note: Agar problem mein empty string count nahi karni
 *        → sirf 'count' return karo.
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  Time  → O(N^2)
 *          N suffixes × average N/2 length = O(N^2)
 *
 *  Space → O(N^2) for Trie nodes in worst case
 *          (jab sab characters distinct hon)
 *
 *  vs Brute Force (HashSet approach):
 *  HashSet → O(N^3)  [O(N^2) substrings, O(N) hashing each]
 *  Trie    → O(N^2)  ← better ✓
 *
 * ============================================================
 */
```