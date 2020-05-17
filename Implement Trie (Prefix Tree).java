// https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3329/

class Trie {

    trie_node root;
    public Trie() {
        root = new trie_node();
    }
    
    public void insert(String word) {
        trie_node curr = root;
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i)-97;
            
            if(curr.children[idx] == null)
                curr.children[idx] = new trie_node();
            
            curr = curr.children[idx];
        }
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        trie_node curr = root;
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i)-97;
            
            if(curr.children[idx] == null)return false;
            
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        trie_node curr = root;
        for(int i=0;i<prefix.length();i++)
        {
            int idx = prefix.charAt(i)-97;
            
            if(curr.children[idx] == null)return false;
            
            curr = curr.children[idx];
        }
        return true;
    }
}
class trie_node
{
    boolean isEnd;
    trie_node[] children;
    trie_node()
    {
        isEnd = false;
        children = new trie_node[26];
        for(int i=0;i<26;i++)
            children[i] = null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */