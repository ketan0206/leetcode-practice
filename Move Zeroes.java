class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
		for (int i = 0 ; i < n ; ) {
			if (nums[i]==0) {
				for (int j = i ; j < n-1 ; j++) {
					nums[j] = nums[j+1];
				}
				nums[n-1] = 0;
				n--;
			} else {
                i++;
            }
		}
    }
}