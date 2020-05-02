class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list =                            Arrays.stream(nums).boxed().collect(Collectors.toList());
		Collections.sort(list);
		
		int[] result = new int[nums.length];
		for (int i=0 ;i<nums.length; i++) {
			result[i] = list.indexOf(Integer.valueOf(nums[i]));
		}
		return result; 
		
    }
}