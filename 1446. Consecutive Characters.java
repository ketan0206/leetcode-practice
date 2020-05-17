// https://leetcode.com/contest/biweekly-contest-26/problems/consecutive-characters/

class Solution {
    public int maxPower(String s) {
        int power = 1;
		char[] ch = s.toCharArray();
		Set<Character> cSet = new HashSet<>();
		
		int i = 0;
		
		for (char c : s.toCharArray()) {
			int n = cSet.size();
			cSet.add(c);
			//i++;
			
			if (cSet.size()>n) {
				power = Math.max(power, i);
				cSet = new HashSet<>();
				cSet.add(c);
				i = 1;
			} else {
				i++;
				power = Math.max(power, i);
			}
			
		}
		
		
		return power;
    }
}