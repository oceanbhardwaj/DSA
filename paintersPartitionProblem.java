//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
    static long minTime(int[] arr,int n,int k){
       //three necessary conditions
       //1) it should be continous
       //2)  1 painter paint atleast one board
       //3) can divide boards work
     //  o(Nlog(sum-max))
       long sum=0;
       long max=0;
       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
           max=Math.max(max,arr[i]);
       }
       long start=max;
       long end=sum;
       long ans=0;
       while(start<=end){
          // int mid=(start+end)/2;
           long MaxNoOfboards=(start+(end-start)/2);//to avoid integer ovrflow
           if(isValidAllocation(MaxNoOfboards,k,n,arr)){
               ans=MaxNoOfboards;
               end=MaxNoOfboards-1;
           }else{
               start=MaxNoOfboards+1;
           }
       }
       return ans;
    }
    
    public static boolean isValidAllocation(long MaxNoOfboards,int k,int n,int arr[]){
        long painters=1;
        long noOfBoards=0;
        for(int i=0;i<n;i++){
            noOfBoards+=arr[i];
            if(noOfBoards>MaxNoOfboards){
                painters++;
                noOfBoards=arr[i];
                
            }
            if(painters>k)
            return false;
        }
        return true;
    }
}


