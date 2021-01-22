class Solution {
   
    static int parent[];
    static Set<Integer> set;
     HashMap<Integer,ArrayList<Integer>> h;
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        h=new HashMap<>();
        int n=allowedSwaps.length;
        
        parent=new int[source.length];
        for(int i=0;i<parent.length;i++)
            parent[i]=i;
        for(int a[]:allowedSwaps)
        {
            if(a[1]>a[0])
            Union(a[0],a[1]);
            else
                Union(a[1],a[0]);
        }
        for(int i=0;i<parent.length;i++)
        {
            parent[i]=parent[parent[i]];
        }
       
        for(int i=0;i<parent.length;i++)
        {
            h.putIfAbsent(parent[i],new ArrayList<>());
            h.get(parent[i]).add(i);
        }
        int count=0;
        for(int i:h.keySet())
        {
            ArrayList<Integer> a1=h.get(i);
            ArrayList<Integer> set=new ArrayList<>();
            for(int i1:a1)
            {
                set.add(source[i1]);
            }
            for(int i1:a1)
            {
                if(!set.contains(target[i1]))
                    count++;
                else
                    set.remove(set.indexOf(target[i1]));
            }
        }


        return count;
        
    }
    public static void Union(int x,int y)
    {
        int p1=find(x);
        int p2=find(y);
        if(p1==p2)
            return;
         parent[p2]=p1;
    }
    public static int find(int node)
    {
        if(parent[node]==node)
            return node;
        int p=find(parent[node]);
        return parent[node]=p;
    }
}