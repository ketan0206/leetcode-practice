// https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3322/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public class KeyPair{
int key;
int value;

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}

public boolean isCousins(TreeNode root, int x, int y) {
    KeyPair first=new KeyPair();
    KeyPair second=new KeyPair();
    if(root.val==x||root.val==y)return false;
    first=dfs(root,x,0,first);

    second=dfs(root,y,0,second);
 
    if(first.key!=second.key&&first.value==second.value)
        return true;

    return false;


}
public KeyPair dfs(TreeNode root, int target, int depth,KeyPair result){

    if(root==null)return null;
     if(root.right!=null){
        if(root.right.val==target){
            //result.put(root.val,depth+1);
            result.key=root.val;
            result.value=depth+1;
        }
         dfs(root.right,target,depth+1,result);

    }
     if(root.left!=null){
        if(root.left.val==target){
            //result.put(root.val,depth+1);
            result.key=root.val;
            result.value=depth+1;
        }
         dfs(root.left,target,depth+1,result);

    }
   
    return result;
}
}