/*package whatever //do not write package name here */

import java.util.*;

class GFG {
  static class Pair{
        int destination;
        int distance;
        Pair(int destination,int distance)
        {
            this.destination=destination;
            this.distance=distance;
        }
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
//	System.out.println("t :"+t);
	for(int i=0;i<t;i++){
	    
	    int noOfCities=sc.nextInt();
	    //	System.out.println("noOfCities :"+noOfCities);
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
	    HashMap<String,Integer> h=new HashMap<>();
	    int count=1;
	    for(int i1=0;i1<=noOfCities;i1++)
	    adj.add(new ArrayList<Pair>());
	    for(int c=0;c<noOfCities;c++){
	        
	       String citiName=sc.next();
	        //	System.out.println("citiName :"+citiName);
	        h.put(citiName,count);
	        int con=sc.nextInt();
	        //	System.out.println("con :"+con);
	        for(int j=0;j<con;j++){
	            int node=sc.nextInt();
	            int d=sc.nextInt();
	            //	System.out.println("node :"+node +"  d:"+d);
	            adj.get(count).add(new Pair(node,d));
	        }
	        
	        
	        count++;
	        
	    }
	    
	    int x=sc.nextInt();
	    //	System.out.println("x :"+x);
	    for(int xx=0;xx<x;xx++){
	        String source=sc.next();
	        String destination=sc.next();
	        
	        //	System.out.println("source :"+source +" destination :"+destination);
	        int Actsource=h.get(source);
	        int ActDest=h.get(destination);
	       int dist[]=new int[noOfCities+1];
	       Arrays.fill(dist,Integer.MAX_VALUE);
	       dist[Actsource]=0;
	       boolean visited[]=new boolean[noOfCities+1];
	       dijkstra(Actsource,dist,adj,visited);
	      // System.out.println(Arrays.toString(dist));
	      // System.out.println(h);
	       System.out.println(dist[ActDest]);
	    }
	    
	    System.out.println();
	}
	}
	
	public static void dijkstra(int source,int dist[],ArrayList<ArrayList<Pair>> adj,boolean visited[]){
	    
	    PriorityQueue<Pair> q=new  PriorityQueue<Pair>((o1,o2)->o1.distance-o2.distance);
	    q.add(new Pair(source,dist[source]));
	    while(!q.isEmpty()){
	        Pair pp=q.poll();
	        int nn=pp.destination;
	        int dd=pp.distance;
	        if(visited[nn])
	        continue;
	        visited[nn]=true;
	        for(int v=0;v<adj.get(nn).size();v++){
	            Pair p=adj.get(nn).get(v);
	            int adjnode=p.destination;
	            int adjdist=p.distance;
	            if(dd+adjdist<dist[adjnode]){
	                dist[adjnode]=dd+adjdist;
	                q.add(new Pair(adjnode,dist[adjnode]));
	            }
	        }
	    }
	    
	   
	    
	}
}