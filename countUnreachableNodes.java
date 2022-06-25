class Solution {
     long c=0;
    public long countPairs(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ArrayList<>());
        }
        for(int a1[]:edges){
            add(a1[0],a1[1],a);
        }
        long count=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            c=0;
           if(!visited[i])
            c= dfs(i,visited,n,a);
           // System.out.println(c);
            count+=c*(n-c);
        }
        return count/2+count%2;
        
    }
    public void add(int x,int y, ArrayList<ArrayList<Integer>> a){
        a.get(x).add(y);
        a.get(y).add(x);
    }
    public int countPair(boolean visited[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i])
                count++;
        }
        return count;
    }
    public long dfs(int start,boolean visited[],int n, ArrayList<ArrayList<Integer>> a){
        if(start>=n)
            return c;
        if(visited[start])
            return c;
        visited[start]=true;
        c++;
        for(int i=0;i<a.get(start).size();i++){
            int adj=a.get(start).get(i);
            if(!visited[adj])
                dfs(adj,visited,n,a);
        }
        return c;
    }
}