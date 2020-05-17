// https://leetcode.com/explore/featured/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3332/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> index = new LinkedList<>();
	int[] arrS = new int[26];
	int[] arrP = new int[26];
	for(char c : p.toCharArray()) ++arrP[c - 'a'];

	for(int i = 0, start = 0, length = p.length(); i < s.length(); i++) {
		++arrS[s.charAt(i) - 'a'];
		if(i - start + 1 == length) {
			if(Arrays.equals(arrS, arrP)) index.add(start);
			--arrS[s.charAt(start) - 'a'];
			++start;
		}
	}
	return index;
    }
}