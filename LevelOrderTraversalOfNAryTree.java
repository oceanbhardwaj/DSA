class Solution {
    public List<List<Integer>> levelOrder(Node root) {
       
        List<List<Integer>> a=new ArrayList<>();
        if(root==null)
            return a;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> res=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
               Node n=q.poll();
                res.add(n.val);
                for(Node node:n.children)
                    q.add(node);
                
                
                
                
                
            }
            a.add(res);
            
            
            
            
            
            
        }
        return a;
    }
}