class Solution {
    int d=0;
    public int findTilt(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 0;
       
         d=Math.abs(sum(root.left)-sum(root.right));
        
        return d+findTilt(root.left)+findTilt(root.right);
        
    }
    private int sum(TreeNode root)
    {
        if(root==null)
            return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
}