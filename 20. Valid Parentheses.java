class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        for (int i = 0 ; i < n ; i++) {
			s = s.replace("()", "");
			s = s.replace("[]", "");
			s = s.replace("{}", "");
		}
		return s.isEmpty() ? true : false;
    }
}