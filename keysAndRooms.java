class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        dfs(0,visited,rooms);
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
                return false;
        }
        return true;
    }
    public void dfs(int start,boolean visited[],List<List<Integer>> rooms ){
        if(visited[start])
            return;
        visited[start]=true;
        for(int i=0;i<rooms.get(start).size();i++){
            int adjele=rooms.get(start).get(i);
            if(!visited[adjele])
                dfs(adjele,visited,rooms);
        }
    }
}