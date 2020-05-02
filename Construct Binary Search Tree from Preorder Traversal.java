/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length);
    }
    private TreeNode helper(int[] preorder, int from, int end){
        if(from >= end)
            return null;
        int curEnd = findEnd(preorder,from, end);
        TreeNode curNode = new TreeNode(preorder[from]);
        curNode.left = helper(preorder, from+1, curEnd);
        curNode.right = helper(preorder, curEnd, end);
        return curNode;
        
    }
    private int findEnd(int[] preorder, int start, int end){
        int i = start +1;
        for(; i< end; i++){
            if(preorder[i]>= preorder[start])
                break;
        }
        return i;
    }
}