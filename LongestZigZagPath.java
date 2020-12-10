class Solution {
    int res=0;
    public int longestZigZag(TreeNode root) {
        if(root==null)
            return 0;
        dfs(root.left,1,false);
        dfs(root.right,1,true);
        return res;
    }
    public void dfs(TreeNode root,int prev,Boolean left)
    {
        if(root==null)
            return;
        res=Math.max(res,prev);
        dfs(root.left,(left?prev:0)+1,false);
        dfs(root.right,(left?0:prev)+1,true);
    }
}