class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> a=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        for(int i:to_delete)
            s.add(i);
        dfs(root,s,a);
        if(!s.contains(root.val))
            a.add(root);
        return a;
        
    }
    public TreeNode dfs(TreeNode root,Set<Integer> s,List<TreeNode> a)
    {
        if(root==null)
            return null;
        root.left=dfs(root.left,s,a);
        root.right=dfs(root.right,s,a);
        
        if(s.contains(root.val))
        {
            if(root.left!=null)
                a.add(root.left);
            if(root.right!=null)
                a.add(root.right);
           
            
            return null;
        }
        return root;
        

        
        
        
        
        
        
    }
}