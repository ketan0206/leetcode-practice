// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

class Solution {
    public int maxVowels(String s, int k) {
        
		char[] array = s.substring(0, k).toCharArray();
		int count = 0;
		for (int i = 0 ; i <array.length ; i++) {
			if (isCharVowel(array[i])) {
				count++;
			}
		}
		
		int max = count;
		char [] aa = s.toCharArray();
		for (int i=0 ; i < aa.length-k; i++) {
			int j = i+k;
			if (isCharVowel(aa[i])) {
				if (!(isCharVowel(aa[j]))) {
					max = Math.max(max, --count);
				}
			}
			else if (isCharVowel(aa[j])) {
				if (!(isCharVowel(aa[i]))) {
					max = Math.max(max, ++count);
				}
			}
			
		}
		return max;
    }
    public boolean isCharVowel(char c) {
		
		if (c == 'a' || c == 'e' || c == 'i'
				|| c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}
}