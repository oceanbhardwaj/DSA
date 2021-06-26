class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i:a)
        h.add(i);
        
        for(int i:b)
        h.add(i);
        return h.size();
    }
}