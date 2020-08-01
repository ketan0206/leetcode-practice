// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3409/

class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.toLowerCase().equals(word)) {
			return true;
		}
		if (word.charAt(0) >=65 && word.charAt(0) <= 90 && word.substring(1).toLowerCase().equals(word.substring(1))) {
			return true;
		}
		if (word.toUpperCase().equals(word)) {
			return true;
		}
		return false;
    }
}