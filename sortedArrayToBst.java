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
    TreeNode root=null;
    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        root=new TreeNode(nums[mid]);
       root.left=call(0,mid-1,nums);
        root.right=call(mid+1,end,nums);
        return root;
    }
    public TreeNode call(int start,int end,int nums[]){
        if(root==null || start>end || start>=nums.length || end<0)
            return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=call(start,mid-1,nums);
        root.right=call(mid+1,end,nums);
        return root;
    }
}
---------------------------------------------------------------------------
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
  
    public TreeNode sortedArrayToBST(int[] nums) {
       
       return call(0,nums.length-1,nums);
    }
    public TreeNode call(int start,int end,int nums[]){
        if ( start>end || start>=nums.length || end<0)
            return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=call(start,mid-1,nums);
        root.right=call(mid+1,end,nums);
        return root;
    }
}