// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3419/

class Solution {
    public int titleToNumber(String s) {
        int sum =0;
    for(char c: s.toCharArray()){
        sum = sum *26 + (c - 'A') +1;
    }
    return sum;
    }
}