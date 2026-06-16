```java
/*
 * ============================================================
 *  PREFIX PROBLEM  (Trie)
 * ============================================================
 *
 *  PROBLEM STATEMENT:
 *  Har word ke liye uska SHORTEST UNIQUE PREFIX find karo.
 *  Assume: koi bhi word dusre word ka prefix nahi hai.
 *
 * ------------------------------------------------------------
 *  EXAMPLE:
 * ------------------------------------------------------------
 *
 *  arr[]  = { "zebra", "dog", "duck", "dove" }
 *  ans    = { "z",     "dog", "du",   "dov"  }
 *
 *  Why?
 *  "zebra" → "z"   (sirf "z" se start hone wala word hai)
 *  "dog"   → "dog" ("do" se duck/dove bhi start hote hain,
 *                    "dog" poora likhna padega)
 *  "duck"  → "du"  ("du" se sirf "duck" start hota hai)
 *  "dove"  → "dov" ("do" → dog/duck/dove, "dov" → sirf dove)
 *
 * ------------------------------------------------------------
 *  KEY INSIGHT:
 * ------------------------------------------------------------
 *
 *  Unique prefix woh hota hai jahan Trie mein node ka
 *  sirf EK child ho (branch nahi banta).
 *
 *  Matlab: jis node ke baad sirf ek hi path hai,
 *          wahan tak ka prefix = shortest unique prefix.
 *
 *  OR simpler approach:
 *  Har TrieNode mein ek counter rakho → kitne words
 *  is node se guzre (freq / childCount).
 *  Jab count = 1 ho jaaye → woh character unique prefix
 *  ka last character hai.
 *
 * ------------------------------------------------------------
 *  TRIE STRUCTURE with freq count:
 * ------------------------------------------------------------
 *
 *  Insert: "zebra", "dog", "duck", "dove"
 *
 *          root(4)
 *         /       \
 *        z(1)     d(3)
 *        |        |
 *        e(1)     o(3)
 *        |       / | \
 *        b(1)  g(1) u(1) v(1)
 *        ...        |    |
 *                  c(1) e(1)
 *                  |
 *                  k(1)
 *
 *  "z"  → freq drops to 1 at 'z'  → unique prefix = "z"
 *  "dog"→ freq drops to 1 at 'g'  → unique prefix = "dog"
 *  "duck"→ freq drops to 1 at 'u' → unique prefix = "du"
 *  "dove"→ freq drops to 1 at 'v' → unique prefix = "dov"
 *
 * ------------------------------------------------------------
 *  NODE STRUCTURE:
 * ------------------------------------------------------------
 *
 *  class TrieNode {
 *      TrieNode[] children = new TrieNode[26];
 *      int freq = 0;      // kitne words is node se guzre
 *      boolean isEnd = false;
 *  }
 *
 * ------------------------------------------------------------
 *  JAVA IMPLEMENTATION:
 * ------------------------------------------------------------
 *
 *  // Insert with freq tracking
 *  void insert(String word) {
 *      TrieNode curr = root;
 *      for (char ch : word.toCharArray()) {
 *          int idx = ch - 'a';
 *          if (curr.children[idx] == null) {
 *              curr.children[idx] = new TrieNode();
 *          }
 *          curr = curr.children[idx];
 *          curr.freq++;   // har insert pe count badhao
 *      }
 *      curr.isEnd = true;
 *  }
 *
 *  // Find shortest unique prefix for a word
 *  String uniquePrefix(String word) {
 *      TrieNode curr = root;
 *      StringBuilder prefix = new StringBuilder();
 *
 *      for (char ch : word.toCharArray()) {
 *          int idx = ch - 'a';
 *          prefix.append(ch);
 *          curr = curr.children[idx];
 *
 *          // Jab freq = 1 → sirf yahi word is path pe hai
 *          if (curr.freq == 1) {
 *              return prefix.toString();  // unique prefix mila!
 *          }
 *      }
 *
 *      // Agar poora word bhi unique prefix hai
 *      return prefix.toString();
 *  }
 *
 *  // Main call: sabhi words ke liye prefix nikalo
 *  void findAllPrefixes(String[] arr) {
 *      // Step 1: Insert all words
 *      for (String word : arr) insert(word);
 *
 *      // Step 2: Find prefix for each word
 *      for (String word : arr) {
 *          System.out.println(word + " → " + uniquePrefix(word));
 *      }
 *  }
 *
 * ------------------------------------------------------------
 *  DRY RUN OUTPUT:
 * ------------------------------------------------------------
 *
 *  zebra → z
 *  dog   → dog
 *  duck  → du
 *  dove  → dov
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  Insert all words → O(N * L)
 *  Find all prefixes → O(N * L)
 *  Total            → O(N * L)
 *  Space            → O(N * L * 26)
 *
 *  where N = number of words, L = average word length
 *
 * ============================================================
 */
```