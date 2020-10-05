class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks.length==0)
            return 0;
        if(n==0)
            return tasks.length;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            h.put(tasks[i],h.getOrDefault(tasks[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(h.values());
        int cycles=0;
        
        while(!pq.isEmpty())
        {
            ArrayList<Integer> a=new ArrayList<>();
           for(int i=0;i<n+1;i++)
           {
              if(!pq.isEmpty() )
                  a.add(pq.remove());
           }
            for(int i:a)
            {
                if(--i>0)
                    pq.add(i);
            }
            
            cycles+=(pq.isEmpty()?a.size():n+1);
            
            
            
            
        }
        return cycles;
        
        
    }
}