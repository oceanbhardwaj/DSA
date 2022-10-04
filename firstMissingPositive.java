class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> h=new TreeSet<>();
        //Arrays.sort(nums);
        for(int i:nums){
            h.add(i);
        }
        int arr[]=new int[h.size()];
        int count=0;
        for(int i:h)
            arr[count++]=i;
        int i=0;
        while(i<arr.length && arr[i]<=0)
            i++;
        
         count=1;
        while(i<arr.length && count==arr[i]){
            {
                count++;
                i++;
            }
        }
        return count;
    }
}
--------------------------------------------------------
class Solution {
    public int firstMissingPositive(int[] nums) {
        //step1 find out of bound range and 1
        int n=nums.length;
        boolean isOne=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                isOne=true;
            if(nums[i]<1 || nums[i]>n)
                nums[i]=1;
            
        }
        if(!isOne)
            return 1;
        //step2 mapping
        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i]);
            nums[index-1]=-Math.abs(nums[index-1]);
        }
        //step3 find missing positive
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}