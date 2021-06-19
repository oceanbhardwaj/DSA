class Solution {
    public int majorityElement(int[] nums) {
        
        
        //hashmap..................................................................
        /*HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>nums.length/2)
                return i;
        }
        return -1;*/
        //...........................................................................
    
        //moore voting algo
       /* int count=1;
        int maj=nums[0];
        //find candidate
        for(int i=1;i<nums.length;i++)
        {
            if(maj==nums[i])
                count++;
            else
                count--;
            
            if(count==0)
            {
             maj=nums[i];
                count=1;
            }
        }
    //find ocurance
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maj)
                count++;
            
            if(count>nums.length/2)
                return maj;
            
        }
        
        return -1;*/
        //............................................................
        
        
        //method 3---sorting
        
        
        /*Arrays.sort(nums);
        int count=1;
        int temp=nums[0];
       int max=1;
        int ele=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(temp==nums[i])
                count++;
            else
            {
                count=1;
                temp=nums[i];
            }
            if(max<count)
            {
                max=count;
                ele=temp;
            }
        }
        if(max>nums.length/2)
            return ele;
        return -1;*/
       // ....................................................................
        
        
        //method ---bruteforce
        int max=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
            if(max<count)
            {
                ele=nums[i];
                max=count;
            }
            
        }
        if(max>nums.length/2)
            return ele;
        return -1;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}