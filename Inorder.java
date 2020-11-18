class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      
        List<Integer> a=new ArrayList<>();
          if(root==null)
            return a;
        dfs(root,a);
        return a;
    }
    public void dfs(TreeNode root,List<Integer> a)
    {
       if(root==null)
           return;
        dfs(root.left,a);
        a.add(root.val);
        dfs(root.right,a);
        
        
        
        
        
    }
}*/


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      
        List<Integer> a=new ArrayList<>();
        
        Stack<TreeNode> s=new Stack<>();
       
        TreeNode curr=root;
        while(curr!=null || !s.isEmpty())
        {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
                
            }
             curr=s.pop();
            a.add(curr.val);
            curr=curr.right;
            
        }
        
        
        
        return a;
        
        
    }
}





