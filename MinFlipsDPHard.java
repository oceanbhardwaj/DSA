/*class Solution {
    public int minKBitFlips(int[] A, int K) {
        int n=A.length;
        int count=0;
        for(int i=0;i<=n-K;i++)
        {
            
                if(A[i]==0)
                { count++;
            for(int j=i;j<i+K;j++)
            {
                A[j]=A[j]^1;
            }
                }
        }
        for(int i=0;i<n;i++)
        {
            if(A[i]==0)
                return -1;
        }
        return count;
    }
}*/

class Solution {
    public int minKBitFlips(int[] A, int K) {
        
        int min=0;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=0;       //if(flipped==even and 0)-->>0-1-0  count++;
        //if(flipped==odd && 1)--->> 1-0  count++;
        for(int i=0;i<A.length;i++)
        {
            
            if(A[i]==0)
            {
            if(pq.isEmpty() || pq.size()%2==0)
            {
                count++;
                pq.add(i+K-1);  //last index 
            }  
             } 
            else if(A[i]==1)
            {
                if(pq.size()%2!=0)
                {
                    count++;
                    pq.add(i+K-1);
                }
            }
             if(!pq.isEmpty() && i>=pq.peek())
                pq.poll();
                
                
                
            
            
        }
        
        
        return pq.isEmpty()?count:-1;
        
        
        
        
        
        
        
        
        
    }
}


