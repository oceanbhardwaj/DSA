

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int ele=sc.nextInt();
		    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		    for(int i1=0;i1<n;i1++)
		    {
		        adj.add(new ArrayList<Integer>());
		    }
		    boolean visited[]=new boolean[n];
		    for(int j=0;j<ele;j++)
		    {
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        connectGraph(adj,a,b);
		    }
		    int count=0;
		    for(int i2=0;i2<n;i2++)
		    {
		        if(!visited[i2])
		        {
		            count++;
		            bfs(adj,i2,visited);
		        }
		    }
		    System.out.println(count);
		    
		}
	}
	public static void bfs(ArrayList<ArrayList<Integer>> adj,int start,boolean visited[])
	{
	  visited[start]=true;
	  Queue<Integer> q=new LinkedList<>();
	  q.add(start);
	  while(!q.isEmpty())
	  {
	      int curr=q.poll();
	      for(int i=0;i<adj.get(curr).size();i++)
	      {
	          int curr1=adj.get(curr).get(i);
	      if(!visited[curr1])
	      {
	          q.add(curr1);
	          visited[curr1]=true;
	      }
	      }
	      
	  }
	}
	public static void connectGraph(ArrayList<ArrayList<Integer>> adj,int a,int b)
	{
	    adj.get(a).add(b);
	    adj.get(b).add(a);
	}
}