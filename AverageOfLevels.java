class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> a=new ArrayList<>();
        if(root==null)
            return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty())
        {
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++)
            { TreeNode curr=q.poll();
           
                sum=sum+curr.val;
             if(curr.left!=null)
                 q.add(curr.left);
             if(curr.right!=null)
                 q.add(curr.right);
             
            }
            a.add((double)sum/size);
            
    
        }
        return a;
        
    }
}