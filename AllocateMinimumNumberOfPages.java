// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<N;i++){
            max=Math.max(max,A[i]);
            sum+=A[i];
        }
       // System.out.println("max :"+max +"sum :"+sum);
        int start=max;
        int end=sum;
        while(start<=end){
            int mid=(start-(start-end)/2);
           // System.out.println("mid :"+mid);
            if(isValid(mid,A,M)){
               ans=Math.min(mid,ans);
              // ans=mid;
              // System.out.println("ans :"+ans);
               end=mid-1;
               
            }else
            start=mid+1;
        }
        return ans;
    }
    public static boolean isValid(int total,int A[],int stu){
       int count=1;
       int sum=0;
       for(int i=0;i<A.length;i++){
           sum+=A[i];
           if(sum>total){
               sum=A[i];
               count++;
           }
           if(count>stu)
           return false;
       }
       return true;
        
    }
}