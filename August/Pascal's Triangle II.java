// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3421/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
		list.add(1);
		if (rowIndex==0) {
			
		} else if (rowIndex==1) {
			list.add(1);
		} else {
			
			list.add(1);
			
			for (int l=1; l < rowIndex; l++) {
				List<Integer> result = new ArrayList<>();
				result.add(1);
				for (int i = 0 ; i < list.size()-1; i++) {
					result.add(list.get(i) + list.get(i+1));
				}
				result.add(1);
				list = result;
			}			
		}	
		return list;
    }
}