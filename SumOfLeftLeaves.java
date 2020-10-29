class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 0;
        if(root.left!=null)
            dfs(root.left,1);
        if(root.right!=null)
            dfs(root.right,0);
        return sum;
        
    }
    void dfs(TreeNode root,int t)
    {    if(root==null)
         return;
        
    
        if(root.left==null && root.right==null && t==1)
        {
              sum=sum+root.val;
         return;
        }
       
        dfs(root.left,1);
        dfs(root.right,0);
    }
}