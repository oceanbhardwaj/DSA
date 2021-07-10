class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {  int count=1;
         for(int j=i+1;j<nums.length;j++)
         {
           if(nums[i]==nums[j])
               count++;
         
         }
         if(count>nums.length/2)
             return nums[i];
        
        }
        return -1;
    }
}
///////////////////////////////////////////////////
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {

        h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int i:h.keySet())
        {
              if(h.get(i)>nums.length/2)
                  return i;
        
        }
        return -1;
    }
}
//////////////////////////////////////////////
class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(maj==nums[i])
                count++;
            else
                count--;
            if(count==0)
            {
                count=1;
                maj=nums[i];
            }
        }
         count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(maj==nums[i])
            {
                count++;
            }
           if(count>nums.length/2)
               return maj;

        
        }
        return -1;
    }
}