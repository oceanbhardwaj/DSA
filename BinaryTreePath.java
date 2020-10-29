class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> a=new ArrayList<>();
        if(root==null)
            return a;
        String s=root.val+"";
        if(root.left==null && root.right==null )
        {
            a.add(s);
        }
        if(root.left!=null)
             dfs(root.left,a,s);
        if(root.right!=null)
             dfs(root.right,a,s);
        return a;
        
        
    }
    private void dfs(TreeNode root,List<String> a,String s)
    {
        s+="->"+root.val+"";
        if(root.left==null && root.right==null )
        {
            a.add(s);
            return;
        }
        if(root.left!=null)
         dfs(root.left,a,s);
        if(root.right!=null)
         dfs(root.right,a,s);
    }
}