// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/537/week-4-may-22nd-may-28th/3340/

class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length; 
        int [][]arr=new int [n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j]=Integer.MIN_VALUE;
        return dfs(nums1,nums2,0,0,arr);        
    }
    public int dfs(int []nums1, int []nums2, int p, int q, int [][]arr){
        int sum=0,max=Integer.MIN_VALUE;
        if(p>=nums1.length||q>=nums2.length)
            return 0;
        if(arr[p][q]>Integer.MIN_VALUE)
            return arr[p][q];
        max=dfs(nums1,nums2,p+1,q,arr); // not choosing the element nums1[p] in the resulting subsequence of nums1.
        for(int i=q;i<nums2.length;i++){
            if(nums2[i]==nums1[p]){
                sum=1; // choosing nums2[i] for nums1[p] in the resulting sebsequences of nums2 and nums1 respectively. 
                sum+=dfs(nums1,nums2,p+1,i+1,arr);
                max=Math.max(max,sum); // getting the maximum sum.
            }
        }
        arr[p][q]=max; // storing the maximum sum.
        return max; // returning the maximum sum.
    }
}