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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int leftH=height(root.left);
        int rightH=height(root.right);
        int d=leftH+rightH;
        int e=Math.max(d,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
        return e;
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}
----------------------------------------------------------------------
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
    public int diameterOfBinaryTree(TreeNode root) {
        HashMap<TreeNode,Integer> h=new HashMap<>();
        if(root==null)
            return 0;
        fillHashMap(root,h);
        return maxDiameter(h,root);
    }
    public int fillHashMap(TreeNode root,HashMap<TreeNode,Integer> h){
        if(root==null)
            return 0;
        int leftH=fillHashMap(root.left,h);
        int rightH=fillHashMap(root.right,h);
        int d=1+Math.max(leftH,rightH);
        h.put(root,d);
       return d;
    }
    public int maxDiameter(HashMap<TreeNode,Integer> h,TreeNode root){
        if(root==null)
            return 0;
        int lh=(root.left!=null && h.containsKey(root.left))?h.get(root.left):0;
         int rh=(root.right!=null && h.containsKey(root.right))?h.get(root.right):0;
        return Math.max(lh+rh,Math.max(maxDiameter(h,root.left),maxDiameter(h,root.right)));
        
        
    }
   
}
-----------------------------------------------------------------------
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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
    call(root);
       return res;
    }
    public int call(TreeNode root){
         if(root==null)
            return 0;
        int lh=call(root.left);
        int rh=call(root.right);
        res=Math.max(res,lh+rh);
        return 1+Math.max(lh,rh);
    }
}