//{ Driver Code Starts
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
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        int max=0;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
           
        }
        int res=-1;
        int start=A[N-1];
        int end=sum;
        while(start<=end){
            //int mid=(start+end)/2;
            int mid=(start+(end-start)/2); //max of pages that one student will read
            if(isValid(mid,A,N,M)){
                res=mid;
                end=mid-1;
            }else
            {
                start=mid+1;
            }
            
        }
        return res;
        
    }
    public static boolean isValid(int mid,int A[],int N,int M){
        int stu=1;
        int sum=0;
        for(int i=0;i<N;i++){
            sum=sum+A[i];
            if(sum>mid){
                stu++;
                sum=A[i];
            }
            if(stu>M)
            return false;
        }
        return true;
    }
};