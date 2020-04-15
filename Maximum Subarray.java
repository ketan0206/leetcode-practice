class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int result = nums[0];
        for ( int index = 1 ; index < nums.length ; index++ ) {
        	sum = Math.max(sum + nums[index], nums[index]);
            result = Math.max(sum, result);
        }
        return result; 
    }
}