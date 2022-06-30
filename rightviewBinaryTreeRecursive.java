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
    int max=0;
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer>a =new ArrayList<>();
        call(a,root,1);
        return a;
    }
    public void call(List<Integer> a,TreeNode root,int level){
        if(root==null)
            return;
        if(level>max){
            a.add(root.val);
            max=level;
        }
        call(a,root.right,level+1);
        call(a,root.left,level+1);
    }
}