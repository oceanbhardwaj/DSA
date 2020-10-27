class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        
            Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
       ArrayList<Integer> l=new ArrayList<>();
        while(q.size()>0)
        {
            TreeNode curr=q.poll();
            if(curr==null)
            {
               if(!q.isEmpty())
                   q.add(null);
               
                res.add(0,l);
                l=new ArrayList<>();
            }
            else{
            l.add(curr.val);
                
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                
            
        }}
       // res.add(l);
        
       // Collections.reverse(res);
        return res;
        
        
        
        
        
        
        
       
    }
}