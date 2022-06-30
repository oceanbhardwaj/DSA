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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int left=Height(root.left);
        int right=Height(root.right);
        return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int Height(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(Height(root.left),Height(root.right));
    }
}
--------------------------------------------
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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return call(root)!=-1;
    }
    public int call(TreeNode root){
        if(root==null)
            return 0;
        int lh=call(root.left);
        if(lh==-1)
            return -1;
        int rh=call(root.right);
            if(rh==-1)
                return -1;
        
        if(Math.abs(lh-rh)>1)
            return -1;
        else 
            return Math.max(lh,rh)+1; 
    }
}