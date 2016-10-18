class TrieNode {
    TrieNode[] vertices = new TrieNode[26]; // Alphabets lower case alone.
    boolean isWord;
    char c; // label of the node

    public TrieNode(){}

    public TrieNode(char c) {
        this.c = c;
    }
}


public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert word into Trie
    public void insert(String word) {
        if(word == null) return;
        int len = word.length();
        if(len == 0) return;

        TrieNode currentNode = root;
        for(int i=0;i<len;i++) {
            char c = word.charAt(i);
            int index = c-'a';
            if(currentNode.vertices[index] == null)
                currentNode.vertices[index] = new TrieNode(c);
             currentNode = currentNode.vertices[index];
        }
        currentNode.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {

        if(word == null) return false;
        int len = word.length();
        if(len == 0) return false;

        TrieNode currentNode = root;
        for(int i=0;i<len;i++) {
            char c = word.charAt(i);
            int index = c-'a';
            if(currentNode.vertices[index] == null)
                return false;
            currentNode = currentNode.vertices[index];
        }

        return currentNode.isWord;

    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {

        if(prefix == null) return false;
        int len = prefix.length();
        if(len == 0) return false;

        TrieNode currentNode = root;
        for(int i=0;i<len;i++) {
            if(currentNode.vertices[prefix.charAt(i)-'a'] == null)
                return false;
            currentNode = currentNode.vertices[prefix.charAt(i)-'a'];
        }
        return true;

    }
}
