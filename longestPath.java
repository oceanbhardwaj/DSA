/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<=n;i++){
		    adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n-1;i++)
		{
		    String str=br.readLine();
		    String arr[]=str.split(" ");
		    int a=Integer.parseInt(arr[0]);
		    int b=Integer.parseInt(arr[1]);
		    addEdge(adj,a,b);
		}
	
		int visited[]=new int[n+1];
		Arrays.fill(visited,-1);
		int d=bfs(1,visited,adj);//farthest node
		Arrays.fill(visited,-1);
		int e=bfs(d,visited,adj);
		
		
		
		
	
		System.out.println(visited[e]);
	    }catch(Exception e){
	        
	    }
	}
	public static void addEdge(	ArrayList<ArrayList<Integer>> adj,int a,int b){
	    adj.get(a).add(b);
	    adj.get(b).add(a);
	}
	public static int bfs(int start,int visited[],ArrayList<ArrayList<Integer>> adj){
	    Queue<Integer> q=new LinkedList<>();
	    q.add(start);
	    visited[start]=0;
	  int maxval=0;
	  int maxnode=0;
	    while(!q.isEmpty()){
	       int ele=q.poll();
	       for(int i=0;i<adj.get(ele).size();i++){
	           int adjele=adj.get(ele).get(i);
	           if(visited[adjele]==-1){
	               visited[adjele]=visited[ele]+1;
	               q.add(adjele);
	               if(maxval<visited[adjele]){
	                   maxval=visited[adjele];
	                   maxnode=adjele;
	               }
	           }
	       }
	    }
	    return maxnode;
	 
	}
}