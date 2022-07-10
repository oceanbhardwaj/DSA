// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
       //lastOcc-firstOcc+1;
       int firstOcc=BsFirst(arr,0,n-1,x);
       int lastOcc=BsLast(arr,0,n-1,x);
       if(firstOcc==-1 && lastOcc==-1)
       return 0;
       return lastOcc-firstOcc+1;
       
    }
    public int BsFirst(int arr[],int start,int end,int x){
        int ans=-1;
        while(start<=end){
        int mid=(start-(start-end)/2);
      if(arr[mid]==x)
      ans=mid;
      if(arr[mid]>=x)
      end=mid-1;
      else
      start=mid+1;
      
      
    }
    return ans;
}
public int BsLast(int arr[],int start,int end,int x){
    int ans=-1;
    while(start<=end){
        int mid=(start-(start-end)/2);
        if(arr[mid]==x)
        ans=mid;
        if(arr[mid]<=x)
        start=mid+1;
        else
        end=mid-1;
        
    }
    return ans;
}
}

