//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //DFS to get order
        //transapose
        //dfs on stack
        Stack<Integer> s=new Stack<>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i])
            dfs(s,visited,i,adj);
            
        }
        //reverse
        ArrayList<ArrayList<Integer>> newAdj=new ArrayList<>();
        for(int i=0;i<V;i++){
            newAdj.add(new ArrayList<Integer>());
        }
        reverse(adj,newAdj);
       // System.out.println(newAdj);
        //traverse On stack
       Arrays.fill(visited,false);
        int count=0;
        while(!s.isEmpty()){
          
            int ele=s.pop();
            
            if(!visited[ele]){
                  count++;
            dfs1(ele,visited,newAdj,s);
            }
        }
        return count;
        
    }
    public void dfs(Stack<Integer> s, boolean visited[],int start, ArrayList<ArrayList<Integer>> adj){
        if(visited[start])
        return;
        visited[start]=true;
        for(int i=0;i<adj.get(start).size();i++){
            int ele=adj.get(start).get(i);
            dfs(s,visited,ele,adj);
        }
        s.push(start);
        
    }
    public void reverse( ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> newAdj){
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                int ele=adj.get(i).get(j);
                newAdj.get(ele).add(i);
            }
        }
        }
    
public void dfs1(int start,boolean visited[], ArrayList<ArrayList<Integer>> adjEle,Stack<Integer> s){
  if(visited[start])
  return;
  visited[start]=true;
  for(int i1=0;i1<adjEle.get(start).size();i1++){
      int e1=adjEle.get(start).get(i1);
      dfs1(e1,visited,adjEle,s);
  }
    
    
    
    
}

}
