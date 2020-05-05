//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/

import java.util.Map.Entry;
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				return s.indexOf(entry.getKey().toString());
			}
		}
		return -1;
    }
}