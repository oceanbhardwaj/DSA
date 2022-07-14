class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        Arrays.fill(lis,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && lis[i]<lis[j]+1)
                    lis[i]=lis[j]+1;
            }
        }
        int max=1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,lis[i]);
        }
        return max;
    }
}  
---------------------------------------------------------------------------------
class Solution {
    public int lengthOfLIS(int[] nums) {
        //binary search
        ArrayList<Integer> a=new ArrayList<>();
        a.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            int lastEle=a.get(a.size()-1);
            if(nums[i]>lastEle)
                a.add(nums[i]);
            else
            {
                //binary search ceil
                int ans=-1;
                int target=nums[i];
                int start=0;
                int end=a.size()-1;
                while(start<=end){
                    int mid=(start-(start-end)/2);
                    if(a.get(mid)==target)
                    {
                        ans=mid;
                        break;
                    }else if(a.get(mid)>target){
                        ans=mid;
                        end=mid-1;
                    }else
                        start=mid+1;
                }
                a.set(ans,target);
                
            }
        }
        return a.size();
    }
}