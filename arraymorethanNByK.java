 public int countOccurence(int[] arr, int n, int k) 
    { 
    HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int d=arr[i];
           int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==d)
                count++;
                
            }
            if(count>n/k)
            { h.add(d);
                }
        }
        return h.size();
    }
}
///////////////////////////////////////////
class Solution 
{
    
    public int countOccurence(int[] arr, int n, int k) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i:arr)
        {
            h.put(i,h.getOrDefault(i,0)+1);
            
        }
        for(int i:h.keySet())
        {
            if(h.get(i)>n/k)
            count++;
        }
        return count;
    }
}
