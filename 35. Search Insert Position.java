class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0 ; i < nums.length; i++) {
        if (nums[nums.length-1]<target) {
            return nums.length;
        }
		if (nums[i]==target || nums[i]>=target) {
			return i;
		} 	
	}
        return 0;
    }
}