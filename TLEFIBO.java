class Solution {
    public int findMinFibonacciNumbers(int k) {
        int arr[]=new int[10000000];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<10000000;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        int index=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>k)
            {
                index=i;
                break;
            }
        }
        int sum=0;
        
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=index-1;i>=0;i--)
        {
            sum=sum+arr[i];
            a.add(arr[i]);
            if(sum==k)
            {
               break; 
            }
            else if(sum>k)
            {
                int d=a.indexOf(arr[i]);
                a.remove(d);
                sum=sum-arr[i];
            }
        }
        return a.size();
    }
}