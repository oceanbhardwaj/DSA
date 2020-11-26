class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        dfs(root,pq);
        int d=0;
        while(!pq.isEmpty() && k>0)
        {
           d= pq.poll();
            k--;
        }
        return d;
    }
    public void dfs(TreeNode root,PriorityQueue<Integer> pq)
    { if(root==null)
            return ;
         
       
        pq.add(root.val);
       dfs(root.left,pq);
        dfs(root.right,pq);
    }
}*/


//................................................Arraylist............................
/*class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> pq=new ArrayList<>();
        dfs(root,pq);
        //int d=0;
        
        return pq.get(k-1);
    }
    public void dfs(TreeNode root,ArrayList<Integer> pq)
    { if(root==null)
            return ;
         
       dfs(root.left,pq);
        pq.add(root.val);
       
        dfs(root.right,pq);
    }
}*/
//........................................................................................
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> s=new Stack<>();
        while(true)
        {
            while(root!=null)
            {
               s.push(root);
                root=root.left;
                
            }
            root=s.pop();
            if(--k==0)
                return root.val;
            root=root.right;
            
                
                
                
                
            
            
            
            
            
            
            
            
            
            
        }
    }
}