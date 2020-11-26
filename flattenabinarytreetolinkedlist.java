class Solution {
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        TreeNode curr=root;
        ArrayList<Integer> a=new ArrayList<>();
        dfs(curr,a);
        root.left=null;
     for(int i=1;i<a.size();i++)
     {root.right=new TreeNode(a.get(i));
      root=root.right;}
        
    }
    public void dfs(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null)
            return;
       
        a.add(root.val);
         dfs(root.left,a);
        dfs(root.right,a);
    }
    
}*/




class Solution {
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
           TreeNode curr=s.pop();
              if(curr.right!=null)
                s.push(curr.right);
            
            if(curr.left!=null)
                s.push(curr.left);
          
            curr.left=null;
            if(!s.isEmpty())
                curr.right=s.peek();
            
            
            
            
            
        }        
        
        
        
        
        
        
        
        
    }
}