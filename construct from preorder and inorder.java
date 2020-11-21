class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
        
    }
    public TreeNode helper(int prestart,int instart,int inend,int preorder[],int inorder[])
    {
        if(prestart>preorder.length-1 || instart>inend)
            return null;
        
       TreeNode root=new TreeNode(preorder[prestart]);
        int index=0;
        for(int i=instart;i<=inend;i++)
        {
            if(root.val==inorder[i])
                index=i;
        }
        root.left=helper(prestart+1,instart,index-1,preorder,inorder);
        root.right=helper(prestart+index-instart+1,index+1,inend,preorder,inorder);
        
        
        
        
      return root;  
    }
}