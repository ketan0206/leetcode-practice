// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3333/

class Solution {
    public boolean checkInclusion(String s2, String s1) {
        List<Integer> result = new ArrayList<>();
		int ls = s1.length();
		int ps = s2.length();
		if (ps > ls) {
			return false;
		}
		char[] sArray = s2.toCharArray();
		Arrays.sort(sArray);
		for (int i = 0 ; i < ls-ps+1 ;i++) {
			String sub = s1.substring(i, i+ps);
			char[] subArray = sub.toCharArray();
			Arrays.sort(subArray);
			boolean flag = true;
			for (int j = 0; j<ps; j++) {
				if (sArray[j]!=subArray[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				result.add(i);
			}
		}	
		
		return !result.isEmpty();
    }
}