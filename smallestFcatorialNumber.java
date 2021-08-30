class Solution
{
    int findNum(int n)
    {
        int low=0;
        int high=n*5;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(trailingZeroes(mid)>=n)
            {ans=mid;
            
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public int trailingZeroes(int mid)
    {
        int count=0;
        for(int i=5;mid/i>=1;i=i*5)
        {
            count+=mid/i;
        }
        return count;
    }
}