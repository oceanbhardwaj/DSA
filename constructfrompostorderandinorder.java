class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1,inorder.length-1,0,postorder,inorder);
    }
    public  TreeNode helper(int poststart,int instart,int inend,int postorder[],int inorder[])
    {
        if(instart<inend || poststart<0)
            return null;
        TreeNode root=new TreeNode(postorder[poststart]);
        int index=0;
        for(int i=instart;i>=inend;i--)
        {
            if(root.val==inorder[i])
                index=i;
        }
        root.left=helper(poststart-(instart-index)-1,index-1,inend,postorder,inorder);
        root.right=helper(poststart-1,instart,index+1,postorder,inorder);
        
        return root;
        
        
        
        
        
        
        
    }
}