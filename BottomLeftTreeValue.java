class Solution {
    int max=0;
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                if(i==0)
                    max=curr.val;
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                
            }
        }
        return max;
        
    }
}
//.....................................................................................
class Solution {
    int e=0;
    int max=-1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return e;
    }
    public void dfs(TreeNode root,int d)
    {
       if(root==null)
           return ;
        if(d>max)
        {max=d;
         e=root.val;
        } 
        dfs(root.left,d+1);
        dfs(root.right,d+1);
            
    }        
        
        
        