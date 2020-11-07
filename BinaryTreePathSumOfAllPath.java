class Solution {
    ArrayList<String> a=new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        
        
        String s=root.val+"";
        dfs(root,"");
        
        
        return call(a);
        
    }
    public void dfs(TreeNode root,String s)
    {
        if(root==null)
            return;
        s=s+root.val+"";
    if(root.left==null && root.right==null)
        a.add(s);
         if(root.left!=null)
            dfs(root.left,s);
        if(root.right!=null)
            dfs(root.right,s);
        
        
        
        
        
        
    }
    public int call(ArrayList<String> a)
    { int sum=0;
        
        for(String i:a)
        {
             sum=sum+Integer.parseInt(i,2);
        }
        
        return sum;
        
        
        
        
        
        
    }
}