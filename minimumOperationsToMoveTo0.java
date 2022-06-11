class Solution {
    public int minOperations(int[] nums, int x) {
        //step 1 finding maximum subarray sum length
        int sum=0;
        for(int i:nums)
            sum+=i;
         System.out.println(sum);
        int d=maxSubArrayLength(nums,sum-x);
        System.out.println(d);
        if(sum==x)
            return nums.length;
        return d==Integer.MIN_VALUE?-1:nums.length-d;
        
    }
    public int maxSubArrayLength(int nums[],int x){
        HashMap<Integer,Integer> h=new HashMap<>();
       // h.put((long)0,-1);
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            // System.out.println(sum);
            if((sum-x)==0){
                System.out.println("print :"+(i+1));
                max=Math.max(max,i+1);
                
            }
            else{
            if(h.containsKey(sum-x)){
                max=Math.max(max,i-(h.get(sum-x)+1)+1);
            }
            }
            h.put(sum,i);
        }
        return max;
    }
}