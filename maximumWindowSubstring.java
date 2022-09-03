class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[]=new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<k;j++){
              max=Math.max(max,nums[i+j]);  
            }
            ans[i]=max;
        }
        return ans;
    }
}
------------------------------------------------------------
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<>();
        int ans[]=new int[nums.length-k+1];
        //process first k elements
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
                q.pollLast();
            q.addLast(i);
        }
        
        //next k elements
        for(int i=k;i<nums.length;i++ ){
            ans[i-k]=nums[q.peekFirst()];
            //check for inbounds
            while(!q.isEmpty() && q.peekFirst()<=i-k)
                q.pollFirst();
              while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
                q.pollLast();
            q.addLast(i);
        }
        ans[nums.length-k]=nums[q.peekFirst()];
        return ans;
    }
}