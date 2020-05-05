//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/

class Solution {
    public int findComplement(int num) {
        if(num==0)
     return 1;
        
int res = (int)(Math.pow(2,Math.floor(Math.log(num)/Math.log(2))+1)-1);
 
return num^(res);
    }
}