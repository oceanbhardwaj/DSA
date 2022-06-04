class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //bruteForce
        int arr[]=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            arr[i]=max;
        }
        return arr;
    }
}
-------------------------------------------------------------------------
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<>();
        int arr[]=new int[nums.length-k+1];
        
        //process first k elements
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && nums[i]>=nums[q.peekLast()])
                q.pollLast();
            q.addLast(i);
        }
        int i;
        for( i=k;i<nums.length;i++){
          arr[i-k]=nums[q.peekFirst()];
            //peek() in range
            while(!q.isEmpty() && q.peekFirst()<=i-k)
                q.pollFirst();
            
            //process next element
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
                q.pollLast();
            q.addLast(i);
        }
        arr[i-k]=nums[q.peekFirst()];
        return arr;
    }
}
