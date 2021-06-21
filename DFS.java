class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> a=new ArrayList<>();
        boolean visited[]=new boolean[V];
        dfs(a,adj,0,visited);
        return a;
    }
    public void dfs(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> adj,int start,boolean visited[])
    {
        
        if(visited[start])
        return ;
        visited[start]=true;
        a.add(start);
        for(int i=0;i<adj.get(start).size();i++)
        {
            int curr=adj.get(start).get(i);
            if(!visited[curr])
            {
                dfs(a,adj,curr,visited);
            }
        }
    }
    
}