class Solution {
    public int findKthLargest(int[] nums, int k) {
        //method 1
        //Sorting nlogn
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-k];
    }
}



---------------------------------------------------------------------------------------
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //method 2 max heap nlogn+klogk
         PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
            pq.add(i);
        while(k-1>0 && !pq.isEmpty()){
            pq.poll();
            k--;
        }
        return !pq.isEmpty()?pq.peek():-1;
    }
}

--------------------------------------
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //method 3 min heap  O(klogk +(n-k)logk)
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        for(int i:nums){
            if(pq.size()==k){
                if(i>pq.peek())
                {
                    pq.poll();
                    pq.add(i);
                }
            }else
            pq.add(i);
        }
        return pq.peek();
    }
}
-----------------------------------------------------------------------------------------------
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //QUICK SELECT
        //LARGEST ---> N-K+1
        if(nums.length==1 && k==1)
            return nums[0];
        int n=nums.length;
        int kthLargest=n-k;
        return QuickSelect(nums,kthLargest,0,n-1);
    }
    public int QuickSelect(int nums[],int k,int start,int end){
        if(start<=end){
            int pivot=partition(nums,start,end);
            System.out.println(pivot);
            if(pivot==k)
                return nums[pivot];
            else if(pivot>k)
                return QuickSelect(nums,k,start,pivot-1);
            else
                return QuickSelect(nums,k,pivot+1,end);
        }
        return -1;
    }
    public int partition(int nums[],int start,int end){
        int pivot=nums[start];
        int pi=start;
        while(start<end){
            
            while(start<nums.length && nums[start]<=pivot)
                start++;
            while(end>=0 && nums[end]>pivot)
                end--;
            if(start<end)
                swap(nums,start,end);
        }
        swap(nums,pi,end);
        return end;
    }
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        
    }
}  