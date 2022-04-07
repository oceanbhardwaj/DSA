// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

//METHOD -1 0(NLOGN)
class Solution
{
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
    }
}

//METHOD-2 O(N) two traversal
class Solution
{
    public static void sort012(int a[], int n)
    {
       //counting method
       int zero=0;
       int one=0;
       int two=0;
       for(int i:a){
           if(i==0)
           zero++;
           else if(i==1)
           one++;
           else if(i==2)
           two++;
       }
       for(int i=0;i<zero;i++)
       a[i]=0;
       for(int i=zero;i<(zero+one);i++)
       a[i]=1;
       for(int j=(zero+one);j<n;j++)
       a[j]=2;
       
    }
}

