
 Method -1 : Recursive  timeC=o(n)
 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        if(root==null)
            return a;
        postOrder(root,a);
        return a;
    }
    public void postOrder(TreeNode root,List<Integer> a){
     if(root==null)
         return;
        postOrder(root.left,a);
        postOrder(root.right,a);
        a.add(root.val);
    
    }
}
----------------------------------------------------
Method 2 :iterative o(N)  o(N) space
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null)
            return a;
        while(root!=null || !s.isEmpty()){
            while(root!=null){
                s.push(root);
                a.add(0,root.val);
                root=root.right;
            }
            TreeNode node=s.pop();
            root=node.left;
            
     }
        return a;
    }
}