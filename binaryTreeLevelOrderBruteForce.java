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
      ArrayList<Integer> a;
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        int h=Height(root);
        for(int i=1;i<=h;i++){
            a=new ArrayList<>();
            printKNodes(i,res,1,root);
            res.add(a);
        }
        return res;
    }
    public int Height(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(Height(root.left),Height(root.right));
    }
    public void printKNodes(int count, List<List<Integer>> res,int c,TreeNode root){
        
        if(root==null )
        {
           
            return;
        }
        if(count==c){
           a.add(root.val);
           // return;
        }
      
       printKNodes(count,res,c+1,root.left);
        printKNodes(count,res,c+1,root.right);
       
    }
}