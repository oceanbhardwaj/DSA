class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;
       
        for(int i=1;i<=nums.length-2;i++){
            int diff=nums[i]-nums[i-1];
            int c=2;
          for(int j=i+1;j<nums.length;j++){
             int diff1=nums[j]-nums[j-1];
              if(diff1==diff)
                  c++;
              else
                  break;
             //ystem.out.println(c);
              if(c>=3)
                  count++;
              
              
          }
           //stem.out.println("vghbnm");
        
        }
        return count;
    }
}