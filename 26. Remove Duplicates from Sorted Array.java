class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 1;
		int j = 0;
		for (int i=0 ; i<nums.length-1 ; i++) {
			if (nums[i] < nums[i+1]) {
                nums[++j]=nums[i+1];
				n++;
			}
		}	
        if (nums.length==0) {
            return 0;
        }
		return n;
    }
}