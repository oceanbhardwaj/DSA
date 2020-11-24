class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        ArrayList<Integer> a=new ArrayList<>();
        dfs(root,res,sum,a);
        return res;
    }
    public void dfs(TreeNode root,List<List<Integer>> res,int sum,ArrayList<Integer> a)
    {
        if(root==null )
        return;
        
        a.add(root.val);
        
        if(sum-root.val==0 && root.left==null && root.right==null)
        {
            res.add(a);
            
            return;
            
        }
        dfs(root.left,res,sum-root.val,new ArrayList<>(a) );
        dfs(root.right,res,sum-root.val,new ArrayList<>(a));
        
        
        
        
        
    }
}