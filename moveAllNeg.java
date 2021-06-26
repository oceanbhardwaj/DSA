class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            pos.add(arr[i]);
            else
            neg.add(arr[i]);
        }
        int index=0;
        for(int i:pos)
        arr[index++]=i;
        for(int i:neg)
        {
            arr[index++]=i;
        }
    }
}