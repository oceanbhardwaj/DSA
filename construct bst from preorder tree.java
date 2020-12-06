class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        //TreeNode root=new TreeNode(preorder[0]);
       return dfs(0,preorder.length-1,preorder);
        
        
    }
    public TreeNode dfs(int start,int end,int preorder[])
    {
       if(start>end || start<0 || end>preorder.length-1)
           return null;
        TreeNode root=new TreeNode(preorder[start]);
        int d=-1;
        for(int i=start+1;i<=end;i++)
        {
            if(preorder[i]>root.val)
            {
                d=i;
                break;
            }
        }
        if(d==-1)
            d=end+1;
        root.left=dfs(start+1,d-1,preorder);
        root.right=dfs(d,end,preorder);
        return root;
    }
}