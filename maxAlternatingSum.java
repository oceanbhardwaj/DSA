class Solution {
    public long maxAlternatingSum(int[] nums) {
        HashMap<String,Long> h=new HashMap<>();
        return dfs(nums,0,0,h);
        //0 for even
        //1 for odd
        
    }
    public long dfs(int nums[],int evenOrOdd,int i,HashMap<String,Long> h)
    {
        if(i>=nums.length)
            return 0;
        String s=i+"code"+evenOrOdd;
        if(h.containsKey(s))
            return h.get(s);
        long x=0;
        if(evenOrOdd==0) //even
        {
            long takingEven=nums[i]+dfs(nums,1,i+1,h);
            long notTakingEven=dfs(nums,0,i+1,h);
            x=Math.max(takingEven,notTakingEven);
        }
        else
        {
            long takingOdd=dfs(nums,0,i+1,h)-nums[i];
            long notTakingOdd=dfs(nums,1,i+1,h);
            x=Math.max(takingOdd,notTakingOdd);
        }
        h.put(s,x);
        return x;
    }
}