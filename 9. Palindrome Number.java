class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
			return false;
		}
		StringBuilder builder = new StringBuilder(Integer.toString(x));
		return builder.toString().equals(builder.reverse().toString());
    }
}