class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        if(root==null)
            return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=1;i<=size;i++)
            {
                TreeNode curr=q.poll();
                if(i==size)
                    a.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            
            
            
            
            
        }
        return a;
        
    }
}