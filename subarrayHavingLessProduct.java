class Solution {
    public long countSubarrays(int[] nums, long k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum<k)
                count++;
            for(int j=i+1;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum*(j-i+1)<k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}
----------------------------------
class Solution {
    public long countSubarrays(int[] nums, long k) {
        //SLIDING WINDOW
     int start=0;
        long sum=0;
      long count=0;
       for(int i=0;i<nums.length;i++){
           
           sum+=nums[i];
           
               while(sum*(i-start+1)>=k && start<nums.length){
                   sum=sum-(long)nums[start];
                   start++;
               }
           if(sum*(i-start+1)<k ){
            count+=i-start+1;
              
                 
           }
            
       }
        return count;
    }
    
}