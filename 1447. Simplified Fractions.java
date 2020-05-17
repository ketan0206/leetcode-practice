// https://leetcode.com/contest/biweekly-contest-26/problems/simplified-fractions/

class Solution {
    public List<String> simplifiedFractions(int n) {
       List<Double> value = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		for (int i = 2; i <= n ; i++) {
			for (int j = 1; j<i ; j++) {
				double dd = (double)j/(double)i;
				//if (!value.contains(dd)) {
				boolean flag = false;
					for (int k = 2; k <=j ; k++) {
						if (i%k==0 && j%k==0) {
							flag = true;
						}
					}
					if (flag) {
						continue;
					}
					String s = String.valueOf(j) + "/" + String.valueOf(i);
					result.add(s);
				//}
				//value.add(dd);
				
			}
			
		}
		
		
		return result;
    }
}