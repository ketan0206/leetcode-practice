// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3413/

class WordDictionary {

    /** Initialize your data structure here. */
    Map<Integer, List<String>> map;
    public WordDictionary() {
        map = new HashMap();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        List<String> wordList = map.getOrDefault(word.length(), new ArrayList());
        wordList.add(word);
        map.put(word.length(), wordList);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        List<String> wordList = map.get(word.length());
        if(wordList == null) 
            return false;
        for(String w : wordList) {
            int dot = 0;
            int count = 0;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == '.') dot++;
                if(word.charAt(i) != w.charAt(i)) count++;
            }
            
            if(dot == count) 
                return true;
        }
        
        return false;
    }
}