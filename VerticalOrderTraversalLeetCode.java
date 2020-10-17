class Solution {
    class Que
    {
        int x;
        int y;
        TreeNode node;
       public Que(int x,int y,TreeNode node)
        {
            this.x=x;
            this.y=y;
            this.node=node;
        }
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        TreeMap<Integer,PriorityQueue<Que>> t=new TreeMap<>();
        if(root==null)
            return res;
        Queue<Que> q=new LinkedList<>();
        q.add(new Que(0,0,root));
        Comparator<Que> co=new Comparator<Que>(){
            public int compare(Que a,Que b)
            {
                
                    if(a.y==b.y)
                        return a.node.val-b.node.val;
                   
                        return a.y-b.y;
                
                
            }
            
        };
        while(!q.isEmpty())
        {
            Que temp=q.poll();
           int x=temp.x;
            int y=temp.y;
           TreeNode node=temp.node;
            t.putIfAbsent(x,new PriorityQueue<>(co));
            t.get(x).add(temp);
           
            if(node.left!=null)
            {
                q.add(new Que(x-1,y+1,node.left));
            }
            if(node.right!=null)
            {
                q.add(new Que(x+1,y+1,node.right));
            }
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        for(int i:t.keySet())
        {
            PriorityQueue<Que> l=t.get(i);
            List<Integer> a=new ArrayList<>();
            while(!l.isEmpty())
            {
                a.add(l.poll().node.val);
            }
            res.add(a);
        }
        return res;
        
        
        
        
        
        
        
    }
}