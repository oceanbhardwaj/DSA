class Solution {
    public int partitionArray(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
            pq.add(i);
        int max=pq.poll();
        int count=1;
        while(!pq.isEmpty()){
            if(max-pq.peek()<=k)
            {
                pq.poll();
            }else{
                count++;
                max=pq.poll();
            }
        }
        return count;
        
    }
}