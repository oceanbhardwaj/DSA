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
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        int val=0;
        if(root.left!=null)
            val+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null)
            val+=rob(root.right.left)+rob(root.right.right);
        return Math.max(root.val+val,rob(root.left)+rob(root.right));
    }
}
----------------------------------------------------------------------------------
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
    HashMap<TreeNode,Integer> h=new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        if(h.containsKey(root))
            return h.get(root);
        int val=0;
        if(root.left!=null)
            val+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null)
            val+=rob(root.right.left)+rob(root.right.right);
        h.put(root,Math.max(root.val+val,rob(root.left)+rob(root.right)));
        return h.get(root);
    }
}
--------------------------------------------------------------------------------------------
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
    public int rob(TreeNode root) {
        int res[]=robSub(root);
        return Math.max(res[0],res[1]);
    }
    public int[] robSub(TreeNode root){
        if(root==null)
            return new int[2];
        int left[]=robSub(root.left);
        int right[]=robSub(root.right);
        
        int res[]=new int[2];
        res[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1]=root.val+left[0]+right[0];
        
        return res;
    }
}