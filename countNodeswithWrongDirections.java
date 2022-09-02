class Solution {
    class Pair{
        int dest;
        boolean isFake;
        Pair(int dest,boolean isFake){
            this.dest=dest;
            this.isFake=isFake;
        }
    }
    public int minReorder(int n, int[][] connections) {
       ArrayList<ArrayList<Pair>> list=new ArrayList<>();
       for(int i=0;i<n;i++){
           list.add(new ArrayList<>());
       }
        int count=0;
       for(int a[]:connections){
           list.get(a[0]).add(new Pair(a[1],false));
            list.get(a[1]).add(new Pair(a[0],true));
       }
        
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean visited[]=new boolean[n];
        visited[0]=true;
        while(!q.isEmpty()){
            int popped=q.poll();
            visited[popped]=true;
            for(int i=0;i<list.get(popped).size();i++){
                Pair adj=list.get(popped).get(i);
                if(!visited[adj.dest]){
                    if(adj.isFake)
                        count++;
                    
                    visited[adj.dest]=true;
                    q.add(adj.dest);
                }
            }
            
           
        }
        return (n-1)-count;
    }
}