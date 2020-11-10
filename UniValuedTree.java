class Solution {
   int flag=0;
    public boolean isUnivalTree(TreeNode root) {
        int d=root.val;
        dfs(root,d);
        return (flag==0)? true:false;
        
    }
    public void dfs(TreeNode root,int d)
    {
        if(root==null)
            return;
        if(root.val!=d)
        {flag=1;
         return;}
        dfs(root.left,d);
        dfs(root.right,d);
    }
}
..........................................................................................................BFS.....................................................................
class Solution {
   int flag=0;
    public boolean isUnivalTree(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int d=root.val;
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr.val!=d)
                return false;
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            
            
            
            
            
            
        }
        return true;
        
        
        
        
        
    }
}


