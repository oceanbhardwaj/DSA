class Solution {
    class Pair{
        String val;
        int index;
        Pair(String val,int index){
            this.val=val;
            this.index=index;
        }
    }
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int arr[]=new int[queries.length];
        int count=0;
        Comparator co=new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                if( p1.val.compareTo(p2.val)==0)
                    return p1.index-p2.index;
                return p1.val.compareTo(p2.val);
            }
        };
        PriorityQueue<Pair> p=new PriorityQueue<>(co);
        for(int a[]:queries){
           int k=a[0];
           int x=a[1];
            
             p=new PriorityQueue<>(co);
            for(int i=0;i<nums.length;i++){
                String s=nums[i];
                int left=s.length()-x;
                String newS=s.substring(left);
                p.add(new Pair(newS,i));
                
            }
            k--;
            while(k>0){
                Pair p1=p.poll();
                k--;
            }
            arr[count++]=p.peek().index;
        }
        return arr;
    }
}