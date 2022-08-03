class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int a[]:roads){
            adj.get(a[0]).add(a[1]);
             adj.get(a[1]).add(a[0]);
        }
        int max=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               int d=0;
               if(adj.get(i).contains(j))
                   d=adj.get(i).size()+adj.get(j).size()-1;
               else
                   d=adj.get(i).size()+adj.get(j).size();
            max=Math.max(d,max);
        }
               }
        return max;
    }
}