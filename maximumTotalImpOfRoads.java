class Solution {
    public long maximumImportance(int n, int[][] roads) {
      
        HashMap<Long,Long> h=new HashMap<>();
        for(int a[]:roads){
            long i=a[0];
            long j=a[1];
            h.put(i,h.getOrDefault(i,(long)0)+1);
              h.put(j,h.getOrDefault(j,(long)0)+1);
        }
       // System.out.println(h);
        
        long arr[][]=new long[h.size()][2];
        int l=0;
        for(long i:h.keySet()){
            arr[l][0]=(long)i;
            arr[l][1]=(long)h.get(i);
            l++;
        }
        Comparator co=new Comparator<long []>(){
            public int compare(long a[],long b[]){
                return (int)(b[1]-a[1]);
            }
        };
        Arrays.sort(arr,co);
        long sum=0;
        int count=n;
       for(long a[]:arr){
           sum+=(long)(a[1]*n);
           n--;
       }
        return sum;
        
    }
}