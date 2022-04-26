class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] persons) {
        long arr[]=new long[1000000];
        Map<Integer,Integer> h=new TreeMap();
        for(int i:persons){
            h.put(i,0);
        }
        for(int a[]:flowers){
            
            h.put(a[0],h.getOrDefault(a[0],0)+1);
             h.put(a[1]+1,h.getOrDefault(a[1]+1,0)-1);
            // arr[a[0]]=1;
            // arr[a[1]+1]=-1;
            
        }
        int count=0;
//         for(int i=1;i<arr.length;i++)
//         {
//          arr[i]=arr[i-1]+arr[i];
        
//         }
        
        
        for(int i:h.keySet()){
            count+=h.get(i);
            h.put(i,count);
        }
        int ans[]=new int[persons.length];
        for(int i=0;i<persons.length;i++){
             //ans[i]=(int)arr[persons[i]];
        ans[i]=h.get(persons[i]);
        }
        return ans;
    }
}