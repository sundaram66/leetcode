// https://leetcode.com/problems/add-and-search-word-data-structure-design/

class TrieNode {
    
    boolean isWord;
    TrieNode[] vertices = new TrieNode[26];
    char c;
    
    TrieNode() {}
    
    TrieNode(char c) {
        this.c = c;
    }
    
}

public class WordDictionary {
    
    TrieNode root;
    
    public WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        
        if(word == null) return;
        int len = word.length();
        if(len == 0) return;
        
        TrieNode curr = root;
        for(int i=0;i<len;i++) {
            char c = word.charAt(i);
            int index = c-'a';
            
            if(curr.vertices[index] == null)
                curr.vertices[index] = new TrieNode(c);
            
            curr = curr.vertices[index];
            
        }
        curr.isWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        
        if(word == null) return false;
        int len = word.length();
        if(len == 0) return false;
        
        return recSearch(word,0,root);
    }
    
    
    public boolean recSearch(String word,int index, TrieNode currentNode) {
        
        if(index == word.length()) return currentNode.isWord;
        
        char c = word.charAt(index);
                
        if(c != '.')  {
            int i = c-'a';
            if(currentNode.vertices[i] == null) 
                return false;
            return recSearch(word,index+1,currentNode.vertices[i]);
        }
        
        else {
            for(int j=0;j<26;j++) {
                if(currentNode.vertices[j] != null) {
                    if(recSearch(word,index+1,currentNode.vertices[j]))
                        return true;
                }
            }
            
        }
        
        return false;
         
           

    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
