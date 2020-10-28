.................................................................................................recursive.......................................................................
class Solution {
    
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
       TreeNode right=invertTree(root.right);
        TreeNode left=invertTree(root.left);
        root.left=right;
        root.right=left;
        return root;
        
        
    }
}
..............................................................................iterative...............................................................................................
class Solution {
    
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            TreeNode temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            if(curr.right!=null)
            {
                q.add(curr.right);
                
            }
             if(curr.left!=null)
            {
                q.add(curr.left);
               
            }
        }
        
        return root;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}