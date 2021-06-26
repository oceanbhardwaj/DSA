class Compute {
    
    public void rotate(long arr[], long n)
    {
        long temp=arr[arr.length-1];
        long arr1[]=new long[arr.length];
        for(int i=1;i<n;i++)
        {
            arr1[i]=arr[i-1];
        }
        arr1[0]=temp;
        
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
    }
}
//////////////////////////////////////
class Compute {
    
    public void rotate(long arr[], long n)
    {
        int n1=arr.length;
        reverse(arr,0,n1-1);
        reverse(arr,1,n1-1);
    }
    public void reverse(long arr[],int start,int end)
    {
        while(start<end)
        {
            long temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
////////////////////////////
class Compute {
    
    public void rotate(long arr[], long n)
    {
        long temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    
}