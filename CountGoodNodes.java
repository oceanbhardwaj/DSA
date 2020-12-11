class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        dfs(root,Integer.MIN_VALUE);
        return count;
    }
    public void dfs(TreeNode root,int d)
    {
        if(root==null)
            return;
        if(root.val>=d)
        {  count++;
        d=root.val;}
        dfs(root.left,d);
        dfs(root.right,d);
    }
}