
 Method -1 : Recursive  timeC=o(n)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null)
            return a;
        inOrder(root,a);
        return a;
    }
    public void inOrder(TreeNode root,List<Integer> a){
        if(root==null)
            return;
        inOrder(root.left,a);
        a.add(root.val);
        inOrder(root.right,a);
        
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null)
            return a;
        Stack<TreeNode> s=new Stack<>();
        while(!s.isEmpty() || root!=null){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            TreeNode popped=s.pop();
            a.add(popped.val);
            root=popped.right;
        }
        return a;
    }
}