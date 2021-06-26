import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int arr[]={1,2,-1,8,9,-1,-2,-2,4,5,-13,1,8};
        int low=0;
        int high=arr.length-1;
        //move all neg to beg
        //low will be neg and high will be pos
        while(low<high)
        {
            while(low<arr.length && arr[low]<0)
            low++;
            while(high<arr.length && arr[high]>0)
            high--;
            
            if(low<high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}