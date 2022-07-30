/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static class Pair{
        int x;int y;
        int dist;
        Pair(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
	 while(sc.hasNext()){
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 int d=sc.nextInt();
	 int dist[][]=new int[8][8];
	 boolean visited[][]=new boolean[8][8];
	 for(int i=0;i<8;i++){
	     Arrays.fill(dist[i],Integer.MAX_VALUE);
	 }
	 dist[a][b]=0;
	 dijkstra(visited,dist,a,b,c,d);
	 if(dist[c][d]==Integer.MAX_VALUE)
	 dist[c][d]=-1;
	 System.out.println(dist[c][d]);
	}}
	public static void dijkstra(boolean visited[][],int dist[][],int startx,int starty,int endx,int endy){
	    PriorityQueue<Pair> q=new PriorityQueue<Pair>((o1,o2)->o1.dist-o2.dist);
	    q.add(new Pair(startx,starty,0));
	  	  int arr[]={-2,-2,-1,1,2,2,1,-1};
	int brr[]={-1,1,2,2,1,-1,-2,-2};
	    while(!q.isEmpty()){
	        Pair p=q.poll();
	        int X=p.x;
	        int Y=p.y;
	        int dist1=p.dist;
	        if(startx==endx && starty==endy)
	        {
	            break;
	        }
	        if(visited[X][Y])
	        continue;
	        visited[X][Y]=true;
	        for(int i=0;i<8;i++){
	            int newX=arr[i]+X;
	            int newY=brr[i]+Y;
	            int d=X*newX+Y*newY;
	            if(newX>=0 && newX<8 && newY>=0 && newY<8 && (dist1+d)<dist[newX][newY] ){
	                dist[newX][newY]=dist1+d;
	                q.add(new Pair(newX,newY,dist[newX][newY]));
	            }
	        }
	       
	    }
	     //System.out.println(Arrays.deepToString(dist));
	    
	} 
	    
	    
	    
	    
	    
	    
	
	
}