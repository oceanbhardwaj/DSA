class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        long min=Long.MAX_VALUE;
        Collections.sort(a);
        for(int i=0;i<=n-m;i++)
        {
           if(min>(a.get(i+(int)m-1)-a.get(i)))
           {
               min=a.get(i+(int)m-1)-a.get(i);
           }
        }
        return min;
    }
}