package Platinum_Codes.Trie;

public class TrieCode {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static TrieNode root;

    public static void main(String[] args) {
        String[] keys = {"virat", "rohit", "dhoni", "rahul"};
        String[] output = {"Not found", "Found"};

        root = new TrieNode();

        // Insert keys
        for (String key : keys) {
            insert(key);
        }

        // Search examples
        System.out.println(search("virat") ? output[1] : output[0]);
        delete("dhoni");
        System.out.println(search("dhoni") ? output[1] : output[0]);
    }

    // Insert key into trie
    static void insert(String key) {
        TrieNode temp = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (temp.children[index] == null) {
                temp.children[index] = new TrieNode();
            }
            temp = temp.children[index];
        }
        temp.isEndOfWord = true;
    }

    // Search key in trie
    static boolean search(String key) {
        TrieNode temp = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return temp.isEndOfWord;
    }

    // Delete key from trie
    static boolean delete(String key) {
        return deleteHelper(root, key, 0);
    }

    static boolean deleteHelper(TrieNode current, String key, int depth) {
        if (current == null) return false;

        if (depth == key.length()) {
            if (!current.isEndOfWord) return false;  // word not found
            current.isEndOfWord = false;
            // If no children, node can be deleted
            return isEmpty(current);
        }

        int index = key.charAt(depth) - 'a';
        if (deleteHelper(current.children[index], key, depth + 1)) {
            current.children[index] = null;
            // Return true if no child nodes and not end of another word
            return !current.isEndOfWord && isEmpty(current);
        }
        return false;
    }

    static boolean isEmpty(TrieNode node) {
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null)
                return false;
        }
        return true;
    }
}
