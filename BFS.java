class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> res=new ArrayList<>();
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        
        while(!q.isEmpty())
        {
            int curr=q.poll();
            res.add(curr);
            //adjacent
            for(int i=0;i<adj.get(curr).size();i++)
            {
                int r=adj.get(curr).get(i);
                if(!visited[r])
                {
                    q.add(r);
                    visited[r]=true;
                }
                
            }
        }
        return res;
        
    }
}