import java.util.*;
class SortArray
{
	public static void main(String[] args) 
	{
         int arr[]={ 5,3,2,1};
         int n=arr.length;
         sort(arr,n);
         for(int i=0;i<n;i++)
         {
         	System.out.println(arr[i]);
         }

    }

    static void sort(int arr[],int n)
    {   if(n>1){
    	int index=getmax(arr,n);
    	int temp=arr[n-1];
    	arr[n-1]=arr[index];
    	arr[index]=temp;
    	sort(arr,n-1);}
    }
    static int getmax(int arr[],int size)
    { int index=0;
    	for(int i=1;i<size;i++)
    	{   if(arr[i]>arr[index])
    		index=i;

    	}
    	return index;
    }







	
}