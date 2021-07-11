class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int arr[]=new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<a)
            arr[index++]=array[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(array[i]>=a && array[i]<=b)
            arr[index++]=array[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(array[i]>b)
            arr[index++]=array[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            array[i]=arr[i];
        }
    }
}
/////////////////////////////////
 public void threeWayPartition(int array[], int a, int b)
    {
       int low=0;
       int mid=0;
       int high=array.length-1;
       while(mid<=high)
       {
           if(array[mid]<a)
           {
               swap(mid,low,array);
               mid++;
               low++;
           }
           else if(array[mid]>b)
           {
               swap(mid,high,array);
               high--;
           }
           else
           {
               mid++;
           }
       }
       
    }
    public void swap(int a,int b,int array[])
    {
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
