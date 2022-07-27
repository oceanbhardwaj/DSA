/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<=n;i++){
		    adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    addEdge(adj,a,b);
		}
		int count=0;
		int visited[]=new int[n+1];
		
		for(int i=1;i<=n;i++){
		    if(visited[i]==0){
		        count++;
		        bfs(i,visited,adj);
		    }
		    
		}
		if(count==1 && m==n-1)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
	public static void addEdge(	ArrayList<ArrayList<Integer>> adj,int a,int b){
	    adj.get(a).add(b);
	    adj.get(b).add(a);
	}
	public static void bfs(int start,int visited[],ArrayList<ArrayList<Integer>> adj){
	    Queue<Integer> q=new LinkedList<>();
	    q.add(start);
	    visited[start]=1;
	    while(!q.isEmpty()){
	        int ele=q.poll();
	        for(int i=0;i<adj.get(ele).size();i++){
	            int adjele=adj.get(ele).get(i);
	            if(visited[adjele]==0){
	                visited[adjele]=1;
	                q.add(adjele);
	            }
	        }
	    }
	    
	    
	    
	}
}