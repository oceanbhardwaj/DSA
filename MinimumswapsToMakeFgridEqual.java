class Solution {
    public int minSwaps(int[][] grid) {
        ArrayList<Integer> a=new ArrayList<>();
        int r=grid.length;
        int c=grid[0].length;
        
        for(int i=0;i<r;i++)
        {  int count=0;
            for(int j=c-1;j>=0;j--)
            {
                if(grid[i][j]!=0)
                    break;
                count++;
            }
            a.add(count);
        }
        int t=0;
        int result=0;
        
        for(int i=0;i<r;i++)
        {
            t=-1;
            for(int j=0;j<a.size();j++)
            {
                if(a.get(j)>=r-i-1)
                {   t=j;
                    result+=j;
                    a.remove(j);
                    break;
                }
            }
            if(t==-1)
                return -1;
        }
        return result;
    }
}