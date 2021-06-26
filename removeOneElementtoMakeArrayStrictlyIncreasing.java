class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n=nums.length;
        //LIS VARIATION
        
        int lis[]=new int[n];
        Arrays.fill(lis,1);
        int max=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j] && lis[i]<=lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                    max=Math.max(lis[i],max);
                }
            }
        }
        if(max>=n-1)
            return true;
        return false;
    }
}
/////////////////////////////////////////////
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean removedVar=false;
        int prevEle=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(prevEle>=nums[i]) //not increasing
            {
                if(removedVar) //already one var removed
                    return false;
                
                removedVar=true;
                if(i==1 || nums[i]>nums[i-2]) //then we can remove i-1th ele
                {
                    prevEle=nums[i];
                }
                //else remove ith ele
            }
            else
            {
                prevEle=nums[i]; //update prev
                
            }
        }
        return true;
        
    }
}