// https://leetcode.com/explore/featured/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3330/

class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, curr1 = 0, curr2 = 0, total = 0;
        for(int i = 0; i < A.length; i++){
            curr1 += A[i];
            max = Math.max(max, curr1);
            curr1 = Math.max(curr1, 0);
            
            curr2 += A[i];
            min = Math.min(min, curr2);
            curr2 = Math.min(curr2, 0);
            
            total += A[i];
        }
        
        return max < 0 ? max : Math.max(max, total - min);
    }
}


