class Solution {
    public boolean buddyStrings(String A, String B) {
        Set<Character> set = new HashSet<>();
		if (A.length()!=B.length()) {
			return false;
		}
		
		StringBuilder s = new StringBuilder();
		int diff = 0;
		for (int i = 0 ; i < A.length() ; i++) {
			if (A.charAt(i)!=B.charAt(i)) {
				s.append(A.charAt(i));
				s.append(B.charAt(i));
				diff++;
				if (diff>2) {
					return false;
				}
			} else {
				set.add(A.charAt(i));
			}
		}
		if (A.equals(B) && set.size()<A.length()) {
			return true;
		}
		String str = s.toString();
		if (diff==2 && str.charAt(0)==str.charAt(3) && str.charAt(1)==str.charAt(2)) {
			return true;
		}
		
		return false;
    }
}