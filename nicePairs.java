class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int mod=1000000007;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int diff=(nums[i]%mod-Reverse(nums[i]%mod)%mod)%mod;
           if(h.containsKey(diff)){
               ans=(ans+h.get(diff))%mod;
           }
            h.put(diff,h.getOrDefault(diff,0)+1);
        }
        return ans%mod;
    }
    public int Reverse(int i){
        int res=0;
        while(i>0){
            res=res*10+i%10;
            res=res%1000000007;
            i=i/10;
        }
        return res%1000000007;
    }
}