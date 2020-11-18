class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
            Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean zigzag=true;
        while(!q.isEmpty())
        { int size=q.size();
         ArrayList<Integer> a=new ArrayList<>();
         for(int i=0;i<size;i++)
         { 
            TreeNode curr=q.poll();
            if(zigzag)
            {
                a.add(curr.val);
            }
            else
            {
                a.add(0,curr.val);
            }
             
            if(curr.left!=null)
                q.add(curr.left);
             if(curr.right!=null)
                 q.add(curr.right);
             
             
             }
         res.add(a);
         zigzag=!zigzag;
         
            
            
            
            
            
            
            
            
            
        }
        return res;
        
    }
}*/




class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
            Deque<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean zigzag=true;
        while(!q.isEmpty())
        { int size=q.size();
        LinkedList<Integer> a=new LinkedList<>();
         for(int i=0;i<size;i++)
         { 
            TreeNode curr=q.poll();
            if(zigzag)
            {
               a.addLast(curr.val);
            }
            else
            {
                a.addFirst(curr.val);
            }
            ;
               
            if(curr.left!=null)
                q.add(curr.left);
             if(curr.right!=null)
                 q.add(curr.right);
           
             
             
             }
         res.add(a);
         zigzag=!zigzag;
         
            
            
            
            
            
            
            
            
            
        }
        return res;
        
    }
}