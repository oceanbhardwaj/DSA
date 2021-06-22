class Solution
{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int parent[]=new int[V];
        Arrays.fill(parent,-1);
        
    boolean visited[]=new boolean[V];
    for(int i=0;i<V;i++)
    {
        if(!visited[i])
        {if(bfs(i,adj,parent,visited))
        return true;}
    }
    return false;
    }
    public boolean bfs(int start,ArrayList<ArrayList<Integer>> adj,int parent[],boolean visited[])
    {
        visited[start]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int i=0;i<adj.get(curr).size();i++)
            {
                int val=adj.get(curr).get(i);
                if(!visited[val])
                {
                    q.add(val);
                    visited[val]=true;
                    parent[val]=curr;
                }
                else if(parent[curr]!=val)
                return true;
            }
        }
        return false;
    }
}