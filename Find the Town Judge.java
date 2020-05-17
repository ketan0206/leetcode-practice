// https://leetcode.com/explore/featured/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/

class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length==0) {
            return 1;
        }
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int[] arr : trust) {
			map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
			list.add(arr[0]);
		}
		
		int key = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
		int value = map.get(key);
		
		if (value==N-1 && !list.contains(Integer.valueOf(key))) {
			return key;
		} else {
			return -1;
		}
    }
}