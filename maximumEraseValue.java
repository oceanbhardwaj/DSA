class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            
            HashSet<Integer> h=new HashSet<>();
            h.add(a);
          int sum=a;
              max=Math.max(max,sum);
            for(int j=i+1;j<nums.length;j++){
                if(h.contains(nums[j]))
                    break;
                h.add(nums[j]);
                sum+=nums[j];
                max=Math.max(max,sum);
                
            }
        }
        return max;
    }
}
-------------------------------------------------------------------------------
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       //TWO POINTERS
        int start=0;
        int end=0;
        HashSet<Integer> h=new HashSet<>();
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            while(h.contains(nums[i])){
                sum=sum-nums[start];
                 h.remove(nums[start]);
                start++;
               
            }
            sum+=nums[i];
            max=Math.max(sum,max);
            h.add(nums[i]);
            
        } 
        return max;
    }
}