
......................................................................................................................BFS..........................................................................................................
class Solution {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty())
        {
            count++;
           int size=q.size();
      for(int i=0;i<size;i++)
    {
     Node n=q.poll();
    for(Node node:n.children)
        q.add(node);
      }
            
        }
        return count;
        
    }
}




......................................................................................................................DFS....................................................................................................
class Solution {
    int max=Integer.MIN_VALUE;
    public int maxDepth(Node root) {
    if(root==null)
        return 0;
        return depth(root,1);
    }
        
    public int depth(Node root,int depth)
    {
        if(root.children.isEmpty())
            return depth;
        for(Node node:root.children)
        {
            int cur=depth(node,depth+1);
            max=Math.max(max,cur);
        }
        return max;
    }
        
        
        
        
        
    
}
