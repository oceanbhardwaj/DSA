class Solution {
    TreeNode res=null;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null)
            return null;
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        if(left>right)
        {
            return lcaDeepestLeaves(root.left);
        }
        else if(right>left)
           return  lcaDeepestLeaves(root.right);
        else if(left==right)
        {
            res=root;
            return res;
        }
        return res;
        
    }
    public int getHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}