//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/

import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue()>nums.length/2) {
				return e.getKey();
			}
		}
		return 0;
    }
}