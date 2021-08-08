class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        //nlogn
        
        ArrayList<Integer> a=new ArrayList<>();
        int nums[]=new int[obstacles.length];
        for(int i=0;i<obstacles.length;i++)
        {
            if(a.isEmpty() || a.get(a.size()-1)<=obstacles[i])
            {
                a.add(obstacles[i]);
                nums[i]=a.size();
            }
            else
            {
                int idx=BinarySearchCeil(a,obstacles[i]);
                a.set(idx,obstacles[i]);
                nums[i]=idx+1;
            }
        }
        
        return nums;
    }
    public int BinarySearchCeil(ArrayList<Integer> a,int x)
    {
        int left=0;
        int right=a.size()-1;
        int ans=0;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(a.get(mid)>x)
            {
              ans=mid;
                right=mid-1;
            }
            else
            {
             left=mid+1;
            }
        }
        return ans;
    }
}