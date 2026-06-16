```java 
/*
 * ============================================================
 *  WORD BREAK PROBLEM  (Trie + Recursion)
 * ============================================================
 *
 *  PROBLEM STATEMENT:
 *  Ek input string aur ek dictionary of words diya gaya hai.
 *  Find out karo ki input string ko space-separated
 *  dictionary words mein break kiya ja sakta hai ya nahi.
 *
 * ------------------------------------------------------------
 *  EXAMPLE:
 * ------------------------------------------------------------
 *
 *  words[]  = { "i", "like", "sam", "samsung", "mobile", "ice" }
 *  key      = "ilikesamsung"
 *  output   = true
 *
 *  Breakdown:
 *  "ilikesamsung"
 *   → "i" + "like" + "samsung"   ✓  (all in dictionary)
 *
 * ------------------------------------------------------------
 *  APPROACH: Trie mein dictionary insert karo, phir
 *            recursion se string ko break karo.
 * ------------------------------------------------------------
 *
 *  Step 1: Sabhi dictionary words ko Trie mein insert karo.
 *
 *  Step 2: key ke index 0 se start karo.
 *
 *  Step 3: Har prefix check karo Trie mein:
 *          → Agar prefix ek valid word hai (isEnd = true),
 *            toh baaki remaining string pe recursion karo.
 *          → Agar koi bhi split kaam kare → return true.
 *          → Koi bhi split kaam na kare → return false.
 *
 * ------------------------------------------------------------
 *  DRY RUN:  key = "ilikesamsung"
 * ------------------------------------------------------------
 *
 *  wordBreak("ilikesamsung", root)
 *  ├── prefix "i"            → isEnd? YES
 *  │    └── wordBreak("likesamsung", root)
 *  │         ├── prefix "l"  → isEnd? NO
 *  │         ├── prefix "li" → isEnd? NO
 *  │         ├── prefix "lik"→ isEnd? NO
 *  │         └── prefix "like" → isEnd? YES
 *  │              └── wordBreak("samsung", root)
 *  │                   ├── prefix "s"       → isEnd? NO
 *  │                   ├── prefix "sa"      → isEnd? NO
 *  │                   ├── prefix "sam"     → isEnd? YES
 *  │                   │    └── wordBreak("sung", root)
 *  │                   │         → no valid word → false ✗
 *  │                   └── prefix "samsung" → isEnd? YES
 *  │                        └── wordBreak("", root)
 *  │                             → empty string → TRUE ✓
 *  └── return true ✓
 *
 * ------------------------------------------------------------
 *  JAVA IMPLEMENTATION:
 * ------------------------------------------------------------
 *
 *  // Pehle dictionary insert karo
 *  void insert(String word) {
 *      TrieNode curr = root;
 *      for (char ch : word.toCharArray()) {
 *          int idx = ch - 'a';
 *          if (curr.children[idx] == null) {
 *              curr.children[idx] = new TrieNode();
 *          }
 *          curr = curr.children[idx];
 *      }
 *      curr.isEnd = true;
 *  }
 *
 *  // Word Break recursive function
 *  boolean wordBreak(String key, TrieNode root) {
 *
 *      // Base case: string khatam ho gayi → valid break mila
 *      if (key.length() == 0) return true;
 *
 *      TrieNode curr = root;
 *
 *      for (int i = 0; i < key.length(); i++) {
 *          int idx = key.charAt(i) - 'a';
 *
 *          // Ye character dictionary mein exist nahi karta
 *          if (curr.children[idx] == null) return false;
 *
 *          curr = curr.children[idx];
 *
 *          // Ek valid word mila → remaining string pe try karo
 *          if (curr.isEnd) {
 *              String remaining = key.substring(i + 1);
 *              if (wordBreak(remaining, root)) return true;
 *              // Agar ye split kaam na kare, aage try karo
 *          }
 *      }
 *
 *      return false; // Koi valid split nahi mila
 *  }
 *
 * ------------------------------------------------------------
 *  KEY OBSERVATIONS:
 * ------------------------------------------------------------
 *
 *  1. "sam" bhi isEnd = true hai, but "sung" valid word
 *     nahi → isliye recursion backtrack karta hai aur
 *     "samsung" poora try karta hai.
 *
 *  2. Base case: key.length() == 0 → true
 *     (Matlab string successfully break ho gayi)
 *
 *  3. Agar loop mein null mile → us path se aage koi
 *     word possible nahi → turant return false.
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  Time  → O(2^N) worst case (exponential, bina memoization)
 *          O(N^2) with memoization (DP approach)
 *  Space → O(N * 26) for Trie + O(N) recursion stack
 *
 *  Note: Production mein DP + Trie combo use hota hai
 *        for optimal solution. (LeetCode 139)
 *
 * ============================================================
 */
```