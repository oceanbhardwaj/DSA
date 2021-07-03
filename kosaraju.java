class Solution
{
    
    
    int count=0;
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        Stack<Integer> s=new Stack<>();
        count=0;
        //step1-doing normal dfs and fill stack
        //step2-transpose graph
        //step3-dfs using stack
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {   if(!visited[i])
            dfs(adj,i,visited,s);}
     adj=reverseGraph(adj,V,visited);
        Arrays.fill(visited,false);
        dfsAgain(adj,s,visited);
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int start,boolean visited[],Stack<Integer> s)
    {
        if(visited[start])
        return;
        visited[start]=true;
        for(int i=0;i<adj.get(start).size();i++)
        {
            int curr=adj.get(start).get(i);
            if(!visited[curr])
            dfs(adj,curr,visited,s);
        }
        s.push(start);
        //System.out.println("stack-----"+start);
    }
    public ArrayList<ArrayList<Integer>> reverseGraph(ArrayList<ArrayList<Integer>> adj,int V,boolean visited[])
    {
        ArrayList<ArrayList<Integer>> adjRem =new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adjRem.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
            //visited[i]=false;
            for(int j=0;j<adj.get(i).size();j++)
            {
                int curr=adj.get(i).get(j);
               // int index=adj.get(i).indexOf(curr);
               // adj.get(i).remove(index);
                adjRem.get(curr).add(i);
                //System.out.println(curr+"------"+i);
            }
        }
        return adjRem;
        
    }
    public void dfsAgain(ArrayList<ArrayList<Integer>> adj,Stack<Integer> s,boolean visited[])
    {
        while(!s.isEmpty())
        {
            int p=s.pop();
            if(!visited[p])
            { count++;
            dfs1(adj,p,visited);
            }
            
        }
    }
    public void dfs1(ArrayList<ArrayList<Integer>> adj,int start,boolean visited[])
    {
        
        if(visited[start])
        return;
        visited[start]=true;
        for(int i=0;i<adj.get(start).size();i++)
        {
            int curr=adj.get(start).get(i);
            if(!visited[curr])
            {
                dfs1(adj,curr,visited);
            }
        }
    }
    
}
