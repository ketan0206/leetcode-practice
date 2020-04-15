class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = Arrays.stream(stones).boxed().collect(Collectors.toList());
		
        int n = list.size();
		while (n>1) {
			int max1 = Collections.max(list);
			list.remove((Integer)max1);
			int max2 = Collections.max(list);
			list.remove((Integer)max2);
			
			if (max1!=max2) {
				list.add(max1-max2);
			}
            n = list.size();
		}
        if (list.size()==0) {
            return 0;
        }
		return list.get(0);
    }
}