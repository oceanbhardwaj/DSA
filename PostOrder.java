..................................................................................................................DFS......................................................................................................
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        dfs(root,a);
        return a;
        
    }
    public void dfs(TreeNode root,List<Integer> a)
    {
        if(root==null)
            return;
        dfs(root.left,a);
        dfs(root.right,a);
        a.add(root.val);
    }
}*/



.............................................................................iterative using 2 stacks...............................................................................................................

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null)
            return a;
        
       Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty())
        {
           TreeNode n=s1.pop();
            s2.push(n);
            if(n.left!=null)
                s1.push(n.left);
            if(n.right!=null)
                s1.push(n.right);
            
            
            
            
            
            
            
            
        }
        while(!s2.isEmpty())
        {
            a.add(s2.pop().val);
        }
        return a;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
        