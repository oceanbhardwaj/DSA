................................................................................................recursive..........................................................................
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
       
        TreeNode q=root.left;
        TreeNode r=root.right;
       return call(q,r);
        
    }
    private boolean call(TreeNode q,TreeNode r)
    {
        if(q==null && r==null)
            return true;
        if(q==null ||r==null)
            return false;
        return q.val==r.val && call(q.left,r.right) && call(q.right,r.left);
        
        
        
        
        
    }
}
...................................................................................................................iterative...............................................................................
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode c1=q.poll();
            TreeNode c2=q.poll();
            if(c1==null && c2==null )
                continue;
            if(c1==null || c2==null)
                return false;
            if(c1.val!=c2.val)
                return false;
                q.add(c1.left);
           q.add(c2.right);
                q.add(c1.right);
              
                q.add(c2.left);
 }
        
  return true;
        }
}


