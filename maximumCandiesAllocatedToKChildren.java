class Solution {
    public int maximumCandies(int[] candies, long k) {
     long sum=0;
        int ans=0;
        for(int i=0;i<candies.length;i++){
          sum=sum+candies[i];
        
        }
        long avg=sum/k;
        long left=0;
        long right=avg;
        while(left<=right){
           long mid=(left+right)/2;
        long noOfPiles=numberOfPiles(mid,candies,k);
        if(noOfPiles>=k)
        {left=mid+1;
         ans=(int)mid;
        }
            else
                right=mid-1;
        
        }
        return ans;
    }
    public long numberOfPiles(long mid,int candies[],long k){
            long count=0;
        if(mid==0)
            return k;
    for(int i:candies){
    if(i>=mid && mid!=0)
        count=count+i/mid;
    }
    return count;
    }
}