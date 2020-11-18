class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        dfs(root,a);
        return a;
    }
    public void dfs(TreeNode root,List<Integer> a)
    {
        if(root==null)
            return;
        a.add(root.val);
        dfs(root.left,a);
        dfs(root.right,a);
        
        
        
        
        
    }
}*/



class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        if(root==null)
            return a;
        Stack<TreeNode> q=new Stack<>();
        q.push(root);
        while(!q.isEmpty())
        {
            
            TreeNode n=q.pop();
            a.add(n.val);
            if(n.right!=null)
                q.push(n.right);
            if(n.left!=null)
                q.push(n.left);
            
            
            
            
            
            
            
            
        }
        return a;
        
        
        
        
        
        
        
    }
}







