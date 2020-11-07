.....................................................................DFS..............................................................................
class Solution {
    int flag=0;
    public boolean findTarget(TreeNode root, int k) {
        if(root.left==null && root.right==null)
            return false;
        HashSet<Integer> h=new HashSet<>();
         call(root,h,k);
        if(flag==1)
            return true;
        else
            return false;
        
    }
    public void call(TreeNode root,HashSet<Integer> h,int k)
    {    if(root==null)
        return;
     call(root.left,h,k);
     
      if(h.contains(k-root.val))
            
      {
          flag=1;
          return;
      }
        else
            h.add(root.val);
        call(root.right,h,k);
        
        
        
        
        
        
    }
}*/
.....................................................................................................BFS................................................................................................

class Solution {
    int flag=0;
    public boolean findTarget(TreeNode root, int k) {
        if(root.left==null && root.right==null)
            return false;
        HashSet<Integer> h=new HashSet<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(h.contains(k-curr.val))
                return true;
            h.add(curr.val);
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            
        }

return false;
        
        
        
        
        
        
    }
}
......................................................................Inorder Traversal........................................................................................
do inorder traversal and save in arraylist or array
then apply two sum





