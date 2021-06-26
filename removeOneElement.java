class Solution {
    public boolean canBeIncreasing(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
            boolean flag=true;
            ArrayList<Integer> a=new ArrayList<>();
            //removing i;
            for(int i1=0;i1<nums.length;i1++)
            {
                if(i1!=i)
                    a.add(nums[i1]);
            }
            for(int i2=1;i2<a.size();i2++)
            {
                if(a.get(i2-1)<a.get(i2))
                    continue;
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                return true;
        }
        return false;
        
    }
}