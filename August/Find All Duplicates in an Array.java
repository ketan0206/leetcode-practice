// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i]==nums[i+1]) {
                result.add(nums[i]);
            }
        }
        return result;
    }
}