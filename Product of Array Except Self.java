class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> list = new ArrayList<>();
		int product = 1;
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i]==0) {
				list.add(i);
			} else {
				product *= nums[i];
			}
			if (list.size()==2) {
				return new int[nums.length];
			}
		}
		if (list.size()==1) {
			int[] a = new int[nums.length];
			a[list.get(0)] = product;
			return a;
		} else {
			int[] a = new int[nums.length];
			for (int i = 0 ; i < nums.length ; i++) {
				a[i] = product/nums[i];
			}
			return a;
		}
    }
}