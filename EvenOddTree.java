class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        int max=0;
        while(!q.isEmpty())
        {  level++;
            int size=q.size();
            if(level%2==1)
            max=Integer.MIN_VALUE;
             else
                max=Integer.MAX_VALUE; 
         for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
             if((level%2==1 && curr.val<=max) || (level%2==1 && curr.val%2==0))
                 return false;
              if((level%2==0 && curr.val>=max) || (level%2==0 && curr.val%2!=0))
                 return false;
             max=curr.val;
             if(curr.left!=null)
                 q.add(curr.left);
             if(curr.right!=null)
                 q.add(curr.right);
                
            }
            }
         
         
        
        
      return true;  
    }
}