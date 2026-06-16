```java
/*
 * ============================================================
 *  STARTSWITH PROBLEM  (Trie)
 * ============================================================
 *
 *  PROBLEM STATEMENT:
 *  Trie ke liye ek boolean startsWith(String prefix) function
 *  banao.
 *
 *  → true   agar koi previously inserted word us prefix se
 *            start hota ho.
 *  → false  agar koi bhi word us prefix se start na ho.
 *
 * ------------------------------------------------------------
 *  EXAMPLE:
 * ------------------------------------------------------------
 *
 *  words[]  = { "apple", "app", "mango", "man", "woman" }
 *
 *  startsWith("app")   →  true
 *     ("app" aur "apple" dono "app" se start hote hain ✓)
 *
 *  startsWith("moon")  →  false
 *     (koi bhi word "moon" se start nahi hota ✗)
 *
 * ------------------------------------------------------------
 *  startsWith vs search — KEY DIFFERENCE:
 * ------------------------------------------------------------
 *
 *  search("app")      →  true   (isEnd = true, word exist karta hai)
 *  search("ap")       →  false  (path hai but isEnd = false)
 *
 *  startsWith("app")  →  true   (path exist karta hai ✓)
 *  startsWith("ap")   →  true   (path exist karta hai ✓)
 *  startsWith("moon") →  false  (path hi nahi hai ✗)
 *
 *  Difference:
 *  → search()      : isEnd CHECK karta hai  (exact word chahiye)
 *  → startsWith()  : isEnd CHECK NAHI karta (sirf path kafi hai)
 *
 * ------------------------------------------------------------
 *  TRIE STRUCTURE for given words:
 * ------------------------------------------------------------
 *
 *              (root)
 *           /    |     \
 *          a     m      w
 *          |    / \     |
 *          p   a   o*   o
 *          |   |   |    |
 *          p*  n*  n    m
 *          |       |    |
 *          l       g    a
 *          |       |    |
 *          e*      o    n*
 *                  |
 *                  *    ← "mango" ends here
 *
 *  * = isEnd true
 *
 *  startsWith("app") → root→a→p→p  (path milta hai ✓)
 *  startsWith("moon")→ root→m→o→o  ('o' ke baad 'o' nahi) ✗
 *
 * ------------------------------------------------------------
 *  JAVA IMPLEMENTATION:
 * ------------------------------------------------------------
 *
 *  boolean startsWith(String prefix) {
 *      TrieNode curr = root;
 *
 *      for (int i = 0; i < prefix.length(); i++) {
 *          int idx = prefix.charAt(i) - 'a';
 *
 *          // Agar ye character ka node exist nahi karta
 *          if (curr.children[idx] == null) {
 *              return false;   // prefix exist nahi karta
 *          }
 *
 *          curr = curr.children[idx];
 *      }
 *
 *      // Poora prefix path mil gaya → true
 *      // isEnd check NAHI karte (word complete ho ya na ho)
 *      return true;
 *  }
 *
 * ------------------------------------------------------------
 *  DRY RUN 1:  prefix = "app"
 * ------------------------------------------------------------
 *
 *  i=0: 'a' → children['a'-'a'] = a  (exists ✓)  curr = a
 *  i=1: 'p' → children['p'-'a'] = p  (exists ✓)  curr = p
 *  i=2: 'p' → children['p'-'a'] = p  (exists ✓)  curr = p*
 *
 *  Loop ends → return true ✓
 *  (isEnd = true bhi hai, but hum check hi nahi karte)
 *
 * ------------------------------------------------------------
 *  DRY RUN 2:  prefix = "moon"
 * ------------------------------------------------------------
 *
 *  i=0: 'm' → children['m'-'a'] = m  (exists ✓)  curr = m
 *  i=1: 'o' → children['o'-'a'] = o  (exists ✓)  curr = o
 *  i=2: 'o' → children['o'-'a'] = ?  (null ✗)
 *
 *  return false ✗
 *  ("mango" mein 'ma' ke baad 'n' aata hai, 'o' nahi)
 *
 * ------------------------------------------------------------
 *  COMPLETE TRIE CLASS (LeetCode 208 pattern):
 * ------------------------------------------------------------
 *
 *  class Trie {
 *      TrieNode root = new TrieNode();
 *
 *      void insert(String word) {
 *          TrieNode curr = root;
 *          for (char ch : word.toCharArray()) {
 *              int idx = ch - 'a';
 *              if (curr.children[idx] == null)
 *                  curr.children[idx] = new TrieNode();
 *              curr = curr.children[idx];
 *          }
 *          curr.isEnd = true;
 *      }
 *
 *      boolean search(String word) {
 *          TrieNode curr = root;
 *          for (char ch : word.toCharArray()) {
 *              int idx = ch - 'a';
 *              if (curr.children[idx] == null) return false;
 *              curr = curr.children[idx];
 *          }
 *          return curr.isEnd;   // ← isEnd CHECK
 *      }
 *
 *      boolean startsWith(String prefix) {
 *          TrieNode curr = root;
 *          for (char ch : prefix.toCharArray()) {
 *              int idx = ch - 'a';
 *              if (curr.children[idx] == null) return false;
 *              curr = curr.children[idx];
 *          }
 *          return true;         // ← NO isEnd CHECK
 *      }
 *  }
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  Time  → O(L)  where L = length of prefix
 *  Space → O(1)  extra (Trie already bana hua hai)
 *
 * ============================================================
 */
```