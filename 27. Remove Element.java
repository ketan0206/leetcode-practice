class Solution {
    public int removeElement(int[] nums, int val) {
       int result = nums.length;
        int n = nums.length;
		for (int j = 0 ; j < n ; ) {
			if (nums[j]==val) {
				result--;
				for (int i = j ; i < n-1 ; i++) {
					nums[i] = nums[i+1];
				}
                n--;
			} else {
                j++;
            }
			
		}
		return result;
    }
}