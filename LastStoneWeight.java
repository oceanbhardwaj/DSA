class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        while(pq.size()>2)
        {
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b)
            {
                int d=Math.abs(a-b);
                pq.add(d);
            }
            
        }
        int s=pq.size();
        if(s==1)
            return pq.poll();
        else if(s==0)
            return 0;
        else if(s==2)
        {
            int s1=pq.poll();
            int s2=pq.poll();
            if(s1!=s2)
                return Math.abs(s1-s2);
            else
                return 0;
        }
        return 0;
    }
}