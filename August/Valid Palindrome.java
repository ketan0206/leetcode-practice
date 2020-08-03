// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3411/

class Solution {
    public boolean isPalindrome(String s) {
        
        String sb = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if (sb.isEmpty()) {
            return true;
        }
		int n = sb.length();
		for (int i = 0; i <= (sb.length()-1)/2;i++) {
			if (sb.charAt(i)!=sb.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
    }
}