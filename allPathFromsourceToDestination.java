class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=graph.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int count=0;
       for(int i=0;i<n;i++){
           adj.add(new ArrayList<Integer>());
       }
        for(int a[]:graph){
            for(int i=0;i<a.length;i++){
           adj.get(count).add(a[i]);
            
            }
            count++;
        }
        boolean recStack[]=new boolean[n];
        dfs(0,n-1,recStack,adj,ans,new ArrayList<Integer>());
        return ans;
    }
    public void dfs(int start,int end,boolean recStack[], ArrayList<ArrayList<Integer>> adj, List<List<Integer>> ans,ArrayList<Integer> list){
        if(start==end)
        {
            list.add(end);
            ans.add(list);
            return;
        }
        if(recStack[start])
            return;
        list.add(start);
        recStack[start]=true;
        for(int i=0;i<adj.get(start).size();i++){
            int ele=adj.get(start).get(i);
            dfs(ele,end,recStack,adj,ans,new ArrayList<Integer>(list));
           
           
        }
      
         recStack[start]=false;
        
        
    }
}