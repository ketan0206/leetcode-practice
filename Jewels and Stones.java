class Solution {
    public int numJewelsInStones(String J, String S) {
        int n = S.length();
		int result = 0;
		
		for (char s : J.toCharArray()) {
			result = result + n - S.replace(String.valueOf(s), "").length();
		}
		
		return result;
    }
}