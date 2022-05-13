// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<n;i++){
           h.put(arr[i],h.getOrDefault(arr[i],0)+1);
       }
       for(int i=0;i<n;i++){
           if(h.get(arr[i])==1)
           return arr[i];
       }
       return -1;
    }
}