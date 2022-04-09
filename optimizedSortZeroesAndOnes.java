// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
       int low=0;
       int mid=0;
       int high=n-1;
       while(mid<=high){
           if(a[mid]==0){
               Swap(low,mid,a);
               low++;
               mid++;
           }else if(a[mid]==1){
               mid++;
           }else if(a[mid]==2){
               Swap(mid,high,a);
             
               high--;
           }
       }
    }
    public static void Swap(int a,int b,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

