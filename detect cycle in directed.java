class Solution 
{
    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[]=new boolean[V];
        boolean restack[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(dfs(visited,restack,i,adj))
            {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean dfs(boolean visited[],boolean restack[],int start,ArrayList<ArrayList<Integer>> adj)
    {
        if(restack[start])
        return true;
        if(visited[start])
        return false;
        restack[start]=true;
        visited[start]=true;
        for(int i=0;i<adj.get(start).size();i++)
        {
            int curr=adj.get(start).get(i);
            if(dfs(visited,restack,curr,adj))
            return true;
        }
        restack[start]=false;
        return false;
        
        
        
        
    }
    
    
}