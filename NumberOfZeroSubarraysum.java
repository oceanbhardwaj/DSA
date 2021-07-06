class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
      HashMap<Long,Long> h=new HashMap<>();
      long sum=0;
      h.put((long)0,(long)1);
      long count=0;
      for(int i=0;i<n;i++)
      {
          sum=sum+arr[i];
          if(h.containsKey(sum))
          {
              count+=h.get(sum);
          }
          h.put(sum,h.getOrDefault(sum,(long)0)+1);
      }
      return count;
    }
}