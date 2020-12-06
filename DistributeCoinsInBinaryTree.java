class Solution {
    int moves=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    public int dfs(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        moves=moves+Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
}