// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res=new ArrayList<>();
        boolean visited[]=new boolean[V];
         Queue<Integer> queue=new LinkedList<>();
       
           queue.add(0);
           visited[0]=true;
           bfs(adj,visited,res,queue);
           return res;
       
    }
    public void bfs( ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> res,Queue<Integer> queue){
       
        while(!queue.isEmpty()){
            int popped=queue.poll();
            res.add(popped);
            for(int i=0;i<adj.get(popped).size();i++){
                int ele=adj.get(popped).get(i);
                if(!visited[ele]){
                    visited[ele]=true;
                    queue.add(ele);
                }
            }
        }}
}