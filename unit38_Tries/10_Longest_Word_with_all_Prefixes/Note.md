```java
/*
 * ============================================================
 *  LONGEST WORD WITH ALL PREFIXES  (Trie)
 * ============================================================
 *
 *  PROBLEM STATEMENT:
 *  Words array mein se woh LONGEST string find karo
 *  jiske SABHI prefixes bhi us array mein present hon.
 *
 * ------------------------------------------------------------
 *  EXAMPLE:
 * ------------------------------------------------------------
 *
 *  words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 *  ans   = "apple"
 *
 *  Check "apple":
 *    Prefixes → "a" ✓, "ap" ✓, "app" ✓, "appl" ✓, "apple" ✓
 *    Sab words array mein hain → VALID ✓
 *
 *  Check "apply":
 *    Prefixes → "a" ✓, "ap" ✓, "app" ✓, "appl" ✓, "apply" ✓
 *    Sab hain → VALID ✓  but length = 5, same as "apple"
 *    Tie → lexicographically smaller = "apple" ✓
 *
 *  Check "banana":
 *    Prefixes → "b" ✗  (array mein "b" nahi hai)
 *    → INVALID ✗
 *
 * ------------------------------------------------------------
 *  KEY INSIGHT:
 * ------------------------------------------------------------
 *
 *  Trie mein sabhi words insert karo.
 *  Phir har word ke liye check karo:
 *  → Trie mein root se us word tak ka EVERY node
 *    isEnd = true hona chahiye.
 *  → Matlab har prefix ek complete word hona chahiye.
 *
 *  Agar koi bhi intermediate node ka isEnd = false hai
 *  → us prefix ki koi word array mein nahi → SKIP.
 *
 * ------------------------------------------------------------
 *  TRIE STRUCTURE for given words:
 * ------------------------------------------------------------
 *
 *  Insert: "a","ap","app","appl","apple","apply","banana"
 *
 *  root
 *   ├── a*(isEnd)
 *   │    └── p*(isEnd)
 *   │         └── p*(isEnd)
 *   │              └── l*(isEnd)
 *   │                   ├── e*(isEnd)   ← "apple" ends
 *   │                   └── y*(isEnd)   ← "apply" ends
 *   └── b
 *        └── a
 *             └── n ...  ← "banana", no "b" isEnd → invalid
 *
 *  * = isEnd true
 *
 *  For "apple": a*→p*→p*→l*→e*  → all isEnd=true ✓ VALID
 *  For "apply": a*→p*→p*→l*→y*  → all isEnd=true ✓ VALID
 *  For "banana": b (isEnd=false) → INVALID immediately ✗
 *
 * ------------------------------------------------------------
 *  JAVA IMPLEMENTATION:
 * ------------------------------------------------------------
 *
 *  class TrieNode {
 *      TrieNode[] children = new TrieNode[26];
 *      boolean isEnd = false;
 *  }
 *
 *  // Insert word into Trie
 *  void insert(TrieNode root, String word) {
 *      TrieNode curr = root;
 *      for (char ch : word.toCharArray()) {
 *          int idx = ch - 'a';
 *          if (curr.children[idx] == null)
 *              curr.children[idx] = new TrieNode();
 *          curr = curr.children[idx];
 *      }
 *      curr.isEnd = true;
 *  }
 *
 *  // Check if all prefixes of word exist in Trie
 *  boolean allPrefixExist(TrieNode root, String word) {
 *      TrieNode curr = root;
 *      for (char ch : word.toCharArray()) {
 *          int idx = ch - 'a';
 *          curr = curr.children[idx];
 *          // Agar koi prefix word nahi hai → false
 *          if (!curr.isEnd) return false;
 *      }
 *      return true;
 *  }
 *
 *  // Main function
 *  String longestWord(String[] words) {
 *      TrieNode root = new TrieNode();
 *
 *      // Step 1: Sabhi words insert karo
 *      for (String word : words) insert(root, word);
 *
 *      String ans = "";
 *
 *      // Step 2: Har word check karo
 *      for (String word : words) {
 *          if (allPrefixExist(root, word)) {
 *              // Longer word mile → update
 *              if (word.length() > ans.length()) {
 *                  ans = word;
 *              }
 *              // Same length → lexicographically smaller lo
 *              else if (word.length() == ans.length()
 *                       && word.compareTo(ans) < 0) {
 *                  ans = word;
 *              }
 *          }
 *      }
 *
 *      return ans;
 *  }
 *
 * ------------------------------------------------------------
 *  DRY RUN:
 * ------------------------------------------------------------
 *
 *  words = ["a","banana","app","appl","ap","apply","apple"]
 *
 *  "a"      → allPrefixExist? a*(✓)          → valid, len=1
 *  "banana" → b(isEnd=false)                 → INVALID ✗
 *  "app"    → a*→p*→p*                       → valid, len=3
 *  "appl"   → a*→p*→p*→l*                   → valid, len=4
 *  "ap"     → a*→p*                          → valid, len=2
 *  "apply"  → a*→p*→p*→l*→y*               → valid, len=5
 *  "apple"  → a*→p*→p*→l*→e*               → valid, len=5
 *             len same as "apply", "apple" < "apply" → ans = "apple"
 *
 *  Final ans = "apple" ✓
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  Insert all words → O(N * L)
 *  Check all words  → O(N * L)
 *  Total            → O(N * L)
 *  Space            → O(N * L * 26) for Trie
 *
 *  where N = number of words, L = average word length
 *
 *  Note: LeetCode 720 "Longest Word in Dictionary" is same problem ✓
 *
 * ============================================================
 */
``