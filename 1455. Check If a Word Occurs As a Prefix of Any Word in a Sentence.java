// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i = 0;
		for (String str : sentence.split(" ") ) {
			i++;
			if (str.startsWith(searchWord)) {
				return i;
			}
		}
		return -1;
    }
}