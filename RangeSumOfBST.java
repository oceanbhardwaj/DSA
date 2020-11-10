class Solution {
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
      Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr.val>=low && curr.val<=high)
            {
                sum=sum+curr.val;
            }
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
        
        
        return sum;
        
        
    }
}