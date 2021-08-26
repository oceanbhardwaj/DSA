class Compute  
{ static class Pair
{
    int val;
    int count;
    int index;
    Pair(int val,int count,int index)
    {
        this.val=val;
        this.count=count;
        this.index=index;
    }
}
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        Comparator<Pair> co=new Comparator<Pair>()
        {
            public int compare(Pair p1,Pair p2)
            {
                if(p1.count==p2.count)
                return p1.index-p2.index;
                return p2.count-p1.count;
            }
        };
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(co);
        
        for(int i=0;i<arr.length;i++)
        {
            pq.add(new Pair(arr[i],countBits(arr[i]),i));
        }
        int i=0;
        while(!pq.isEmpty())
        {
           arr[i++]=pq.poll().val; 
        }
    }
    public static int countBits(int n)
    {
        int c=0;
        while(n>0)
        {
            n=n&(n-1);
            c++;
        }
        return c;
    }
}
