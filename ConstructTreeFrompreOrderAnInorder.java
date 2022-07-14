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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return call(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode call(int preorder[],int inorder[],int prestart,int preend,int instart,int inend){
        if(instart>inend || prestart>preend)
            return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        //find in index
        int in=0;
        for(int i=instart;i<=inend;i++){
            if(inorder[i]==root.val)
            {
                in=i;
                break;
            }
        }
        root.left=call(preorder,inorder,prestart+1,preend,instart,in-1);
        root.right=call(preorder,inorder,prestart+(in-instart+1),preend,in+1,inend);
        return root;
        
    }
}