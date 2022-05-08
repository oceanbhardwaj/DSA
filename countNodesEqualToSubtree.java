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
    ArrayList<Integer> res=new ArrayList<>();
    public int averageOfSubtree(TreeNode root) {
        if(root==null)
            return 0;
       call(root,res); 
        
        return res.size();
        
    }
    public void call(TreeNode root,ArrayList<Integer> res){
        if(root==null)
            return;
        int value=root.val;
        int average=getAverage(root);
        int total=getCount(root);
        if(value==(average/total))
        res.add(value);
        
        call(root.left,res);
        call(root.right,res);
        
}
    public int getAverage(TreeNode root){
        if(root==null)
            return 0;
        return root.val+getAverage(root.left)+getAverage(root.right);
    }
    
    public int getCount(TreeNode root){
        if(root==null)
            return 0;
        return 1+getCount(root.left)+getCount(root.right);
    }
}