/*
 * ============================================================
 *  WHAT IS A TRIE?
 * ============================================================
 *
 *  Trie (pronounced "try") ek tree-based data structure hai
 *  jo mainly STRINGS store karne ke liye use hota hai.
 *
 *  "Trie" word "re-TRIE-val" se aaya hai.
 *
 * ------------------------------------------------------------
 *  EXAMPLE:
 * ------------------------------------------------------------
 *
 *  words[] = {"the", "a", "there", "their", "any", "thee"}
 *
 *  Trie Structure:
 *
 *              (root)
 *             /      \
 *            t        a
 *            |        |
 *            h        n
 *            |        |
 *            e        y   ← "any" ends here
 *           / \
 *          r   e   ← "the" ends here, "thee" ends here
 *         / \
 *        e   i
 *        |   |
 *       (e)  r   ← "there" ends here, "their" ends here
 *
 *  Note: "a" word bhi store hota hai (single char node).
 *
 * ------------------------------------------------------------
 *  KEY PROPERTIES:
 * ------------------------------------------------------------
 *
 *  1. Root node empty hota hai (koi character nahi).
 *
 *  2. Har node ek character represent karta hai.
 *
 *  3. Common prefix wale words ek hi path share karte hain.
 *     Example: "the", "there", "their", "thee"
 *     → sab "t → h → e" tak same path follow karte hain.
 *
 *  4. Har node ke paas 26 children ho sakte hain
 *     (a-z ke liye).
 *
 *  5. Word ka end mark karna padta hai (isEnd = true).
 *
 * ------------------------------------------------------------
 *  NODE STRUCTURE (Java):
 * ------------------------------------------------------------
 *
 *  class TrieNode {
 *      TrieNode[] children = new TrieNode[26];
 *      boolean isEnd = false;
 *  }
 *
 *  → children[0] = 'a', children[1] = 'b', ..., children[25] = 'z'
 *  → index nikalna: ch - 'a'
 *    (e.g., 't' - 'a' = 19  →  children[19])
 *
 * ------------------------------------------------------------
 *  TIME COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  Insert  → O(L)   where L = length of word
 *  Search  → O(L)
 *  Delete  → O(L)
 *
 *  (Compared to HashMap: Trie prefix search better karta hai)
 *
 * ------------------------------------------------------------
 *  SPACE COMPLEXITY:
 * ------------------------------------------------------------
 *
 *  O(N * L * 26)
 *  N = total words, L = average word length
 *
 * ------------------------------------------------------------
 *  USE CASES:
 * ------------------------------------------------------------
 *
 *  1. Autocomplete (Google Search type suggestions)
 *  2. Spell checker
 *  3. IP Routing (Longest Prefix Match)
 *  4. Word games (Boggle, Scrabble)
 *  5. T9 predictive text (phone keyboard)
 *
 * ============================================================
 */