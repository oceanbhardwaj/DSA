class Solution {
    public int maximumSum(int[] nums) {
        int max=-1;
       HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=CalSum(nums[i]);
            if(h.containsKey(sum)){
                max=Math.max(max,nums[i]+h.get(sum));
                if(h.get(sum)<nums[i])
                    h.put(sum,nums[i]);
            }else
            {
                h.put(sum,nums[i]);
            }
        }
        return max;
    }
    public int CalSum(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
}