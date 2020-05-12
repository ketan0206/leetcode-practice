int n = nums.length;
		
		if (n==1) {
			return nums[0];
		}
		if (nums[1]!=nums[0]) {
			return 0;
		}
		for (int i = 1 ; i < n-2 ; i++) {
			if (nums[i]==nums[i-1] && nums[i]!=nums[i+1]) {
				if (nums[i+1]!=nums[i+2]) {
					return nums[i+1];
				}
				
			}
		}
		
		return nums[n-1];