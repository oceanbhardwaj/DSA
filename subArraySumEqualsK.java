class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k)
                count++;
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k)
                {count++;}
                // break;}
            }
        }
        return count;
    }
}
----------------------------------------------------------------
class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(h.containsKey(sum-k)){
              count+=h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}