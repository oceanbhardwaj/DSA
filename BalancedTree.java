class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        
        int left=call(root.left);
        int right=call(root.right);
        return (Math.abs(left-right)<=1) && isBalanced(root.left) && isBalanced(root.right);
        
    }
    private int call(TreeNode root)
    {
        if(root==null)
            return 0;
       if(root.left==null && root.right==null)
           return 1;
        return 1+Math.max(call(root.left),call(root.right));
    }
}