class Solution
{
    long countPS(String str)
    {
        return dfs(str,0,str.length()-1);
    }
    public int dfs(String str,int start,int end)
    {
        if(start>=str.length() || end<0 || start>end)
        return 0;
        if(str.charAt(start)==str.charAt(end))
        {
            return 1+dfs(str,start,end-1)+dfs(str,start+1,end);
        }
        else
        {
            return dfs(str,start+1,end)+dfs(str,start,end-1)-dfs(str,start+1,end-1);
        }
    }
}