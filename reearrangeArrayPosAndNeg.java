class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>(); 
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:nums){
            if(i>0)
                pos.add(i);
            else
                neg.add(i);
                
        }
        int i=0;
        int j=0;
        int count=0;
        boolean flag=true;
        while(i<pos.size() && j<neg.size()){
            if(flag)
            {
                nums[count++]=pos.get(i++);
            }else
            {
                nums[count++]=neg.get(j++);
            }
            flag=!flag;
        }
        while(i<pos.size())
            nums[count++]=pos.get(i++);
        
        
        while(j<neg.size()){
            nums[count++]=neg.get(j++);
        }
        return nums;
    }
}
----------------------------------------
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}