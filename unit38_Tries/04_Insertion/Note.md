```java
/*
 * ============================================================
 *  SEARCH IN TRIE
 * ============================================================
 *
 *  Time Complexity: O(L)
 *  where L = length of the key (search word)
 *
 *  Idea: Root se start karo, har character ko ek-ek
 *  karke match karo. Agar koi character match na kare
 *  ya node null ho → word NOT FOUND.
 *  Agar sab match ho jaaye aur last node ka isEnd = true
 *  → word FOUND.
 *
 * ------------------------------------------------------------
 *  TRIE STATE (from previous notes):
 * ------------------------------------------------------------
 *
 *  Stored words: "the", "a", "there", "their", "any", "thee"
 *
 *              (root)
 *             /      \
 *            t        a
 *            |        |
 *            h        n
 *            |        |
 *            e*       y*   ← * = isEnd true
 *           /|\
 *          r  i  e*        ← "thee" ends here
 *          |  |
 *          e* r*            ← "there", "their" end here
 *
 * ------------------------------------------------------------
 *  EXAMPLE 1: key = "thee"   → FOUND ✓
 * ------------------------------------------------------------
 *
 *  Step 1: root → child['t'-'a'] = t  (exists? YES)
 *  Step 2: t    → child['h'-'a'] = h  (exists? YES)
 *  Step 3: h    → child['e'-'a'] = e  (exists? YES)
 *  Step 4: e    → child['e'-'a'] = e  (exists? YES)
 *
 *  Last node ka isEnd = true → "thee" FOUND ✓
 *
 * ------------------------------------------------------------
 *  EXAMPLE 2: key = "thor"   → NOT FOUND ✗
 * ------------------------------------------------------------
 *
 *  Step 1: root → child['t'-'a'] = t  (exists? YES)
 *  Step 2: t    → child['h'-'a'] = h  (exists? YES)
 *  Step 3: h    → child['o'-'a'] = ?  (exists? NO → null)
 *
 *  Null node mila → "thor" NOT FOUND ✗
 *  (Trie mein "o" path hi nahi hai 'h' ke baad)
 *
 * ------------------------------------------------------------
 *  JAVA IMPLEMENTATION:
 * ------------------------------------------------------------
 *
 *  boolean search(String key) {
 *      TrieNode curr = root;
 *
 *      for (int i = 0; i < key.length(); i++) {
 *          int idx = key.charAt(i) - 'a';
 *
 *          // Agar ye character ka node exist nahi karta
 *          if (curr.children[idx] == null) {
 *              return false;   // NOT FOUND
 *          }
 *
 *          curr = curr.children[idx]; // Aage badho
 *      }
 *
 *      // Sare chars match hue, ab check karo isEnd
 *      return curr.isEnd;
 *  }
 *
 * ------------------------------------------------------------
 *  IMPORTANT EDGE CASES:
 * ------------------------------------------------------------
 *
 *  Case 1: key = "the"
 *          → path milta hai (t→h→e), isEnd = true  → FOUND ✓
 *
 *  Case 2: key = "th"
 *          → path milta hai (t→h), but isEnd = false → NOT FOUND ✗
 *          ("th" kabhi insert nahi kiya tha)
 *
 *  Case 3: key = "thor"
 *          → 'o' node hi nahi → NOT FOUND ✗
 *
 *  Case 4: key = ""  (empty string)
 *          → loop chalega hi nahi, root ka isEnd check hoga
 *          (generally root.isEnd = false → NOT FOUND ✗)
 *
 * ------------------------------------------------------------
 *  SEARCH vs PREFIX CHECK (startsWith):
 * ------------------------------------------------------------
 *
 *  search("th")      → false  (isEnd check karta hai)
 *  startsWith("th")  → true   (sirf path exist karna chahiye,
 *                               isEnd matter nahi karta)
 *
 *  boolean startsWith(String prefix) {
 *      TrieNode curr = root;
 *      for (int i = 0; i < prefix.length(); i++) {
 *          int idx = prefix.charAt(i) - 'a';
 *          if (curr.children[idx] == null) return false;
 *          curr = curr.children[idx];
 *      }
 *      return true;  // isEnd check nahi, bas path kafi hai
 *  }
 *
 * ============================================================
 */
```