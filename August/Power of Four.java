// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3412/

class Solution {
    public boolean isPowerOfFour(int num) {
        while (num>1) {
            if (num % 4 != 0) {
                return false;
            }
            num = num/4;
        }
        return num==1;
    }
}