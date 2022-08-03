class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        int count=0;
        for(int a[]:graph){
            for(int j=0;j<a.length;j++){
                adj.get(count).add(a[j]);
            }
            count++;
        }
        System.out.println(adj);
        int color[]=new int[n];
        Arrays.fill(color,-1);
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(color[i]==-1){//unvisited{
                boolean b=bfs(color,i,adj);
            if(!b)
                return false;
            }
        }
        return true;
        
    }
    public boolean bfs(int color[],int start, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        color[start]=1; //red
        while(!q.isEmpty()){
            int ele=q.poll();
        for(int j=0;j<adj.get(ele).size();j++){
            int adjele=adj.get(ele).get(j);
            if(color[adjele]==color[ele])
                return false;
            if(color[adjele]==-1){
               q.add(adjele);
                color[adjele]=color[ele]^1;
                
                
            }
        }
            
            
            
            
            
        }
        return true;
        
        
        
        
    }
}