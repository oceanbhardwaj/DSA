class Solution {
    int count=0;
    public int uniquePathsIII(int[][] grid) {
        //find start
        int start=0;
        int end=0;
        int zero=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                {
                    start=i;
                    end=j;
                }
                if(grid[i][j]==0)
                    zero++;
            }
        }
        dfs(grid,start,end,zero,0);
        return count;
    }
    public void dfs(int grid[][],int start,int end,int zero,int count1){
        if(start<0 || end<0 || start>=grid.length || end>=grid[0].length ||grid[start][end]<0)
            return;
        if(grid[start][end]==2){
            if(count1==zero)
                count++;
            return;
        }
           if(grid[start][end]==1 && count1>0)
            return;
        if(grid[start][end]==0){
        grid[start][end]=-2;
        count1++;
        }
        if(grid[start][end]==-1)
            return;
        dfs(grid,start+1,end,zero,count1);
        dfs(grid,start,end+1,zero,count1);
        dfs(grid,start-1,end,zero,count1);
        dfs(grid,start,end-1,zero,count1);
        if(grid[start][end]==-2){
        grid[start][end]=0;
        count1--;
        }
    }
}