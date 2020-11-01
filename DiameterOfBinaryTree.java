class Solution {
    int max=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
       if(root==null)
           return 0;
        int d1=height(root.left)+height(root.right);
        int d2=diameterOfBinaryTree(root.left);
        int d3=diameterOfBinaryTree(root.right);
        return Math.max(d1,Math.max(d2,d3));
        
    }
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        return 1+ Math.max(height(root.left),height(root.right));
    }
     
       
}