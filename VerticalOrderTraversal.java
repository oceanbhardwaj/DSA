class Solution {
    class Que
    {
        int hd;
        TreeNode node;
        Que(int hd,TreeNode node)
        {
            this.hd=hd;
            this.node=node;
        }
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        TreeMap<Integer,List<Integer>> t=new TreeMap<>();
        if(root==null)
            return res;
        Queue<Que> q=new LinkedList<>();
        q.add(new Que(0,root));
        while(!q.isEmpty())
        {
            Que temp=q.poll();
           int hd=temp.hd;
           TreeNode node=temp.node;
            if(t.containsKey(hd))
            {
                t.get(hd).add(node.val);
            }
            else
            {
                ArrayList<Integer> aa=new ArrayList<>();
                aa.add(node.val);
                t.put(hd,aa);
            }
            if(node.left!=null)
            {
                q.add(new Que(hd-1,node.left));
            }
            if(node.right!=null)
            {
                q.add(new Que(hd+1,node.right));
            }
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        for(int i:t.keySet())
        {
            List l=t.get(i);
           
            res.add(l);
        }
        return res;
        
        
        
        
        
        
        
    }
}