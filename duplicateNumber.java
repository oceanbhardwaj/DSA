class Solution {
    public int findDuplicate(int[] nums) {
      /*  //method 1--------->o(n),o(n)
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums)
        {
            if(h.contains(i))
                return i;
            h.add(i);

        }
        return -1;*/
        
   //........................................................................     
      /*  //method 2--------->sorting o(nlogn),o(1)
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==nums[i-1])
               return nums[i-1];
            
            
            
            
        }
        return -1;*/
  //...........................................................................
        //method 3------>o(n),o(1)
        //using tortoise and hare method --linked list cycle detection
        int slow=nums[0];
        int fast=nums[0];
        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
            slow=nums[0];
        while(fast!=slow)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
        
        
        
        
        
    }
}