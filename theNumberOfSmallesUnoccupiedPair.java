class Solution {
    class Pair
    {
        int a;
        int d;
        int f;
        Pair(int a,int d,int f)
        {
            this.a=a;
            this.d=d;
            this.f=f;
        }
    }
    public int smallestChair(int[][] times, int targetFriend) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((o1,o2)->o1.a-o2.a);
        int c=0;
        for(int a[]:times)
        {
            pq.add(new Pair(a[0],a[1],c));
            c++;
        }
        int arr[]=new int[times.length];
        Arrays.fill(arr,-1);
        
        while(!pq.isEmpty())
        {
           Pair c1=pq.poll();
            int a1=c1.a;
            int d1=c1.d;
            int f1=c1.f;
            for(int i=0;i<times.length;i++){
            if(arr[i]!=-1 && a1>=arr[i])
            {
                arr[i]=d1;
                if(f1==targetFriend)
                    return i;
                break;
            }
            else if(arr[i]==-1)
                {
                    arr[i]=d1;
                 if(f1==targetFriend)
                    return i;
                break;
                    
                   
                }
                
               
                
            }
           
        }
        return -1;
    
    }
}