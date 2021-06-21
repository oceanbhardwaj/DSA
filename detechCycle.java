
class Solution
{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                if(dfs(i,visited,adj,-1))
                {
                    return true;
                }
                
            }
            
        }
        return false;
       
    }
    public boolean dfs(int start,boolean visited[],ArrayList<ArrayList<Integer>> adj,int parent)
    {
        visited[start]=true;
        for(int i=0;i<adj.get(start).size();i++)
        {
            int curr=adj.get(start).get(i);
            if(!visited[curr]) //not
            {
                if(dfs(curr,visited,adj,start))
                return true;
            }
            else if(curr!=parent)
            return true;
            
        }
        return false;
    }
}