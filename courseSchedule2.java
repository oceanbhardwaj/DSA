class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<Integer>());
        }
        int indegree[]=new int[numCourses];
        for(int a[]:prerequisites){
            int start=a[0];
            int end=a[1];
            adj.get(end).add(start);
            indegree[start]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0)
            q.add(i);
        }
        int count=0;
      
        int ans[]=new int[numCourses];
        while(!q.isEmpty()){
           int ele=q.poll();
            ans[count++]=ele;
            for(int i=0;i<adj.get(ele).size();i++){
                int adjele=adj.get(ele).get(i);
                indegree[adjele]--;
                if(indegree[adjele]==0)
                    q.add(adjele);
            }
        }
        return count==numCourses?ans:new int[0];
    }
}