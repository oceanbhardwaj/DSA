// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0;
        int j=0;
       // k--;
        while(i<n || j<m){
            while(i<n && j<m){
                if(arr1[i]<arr2[j]){
                           k--;
                           if(k==0)
                           return arr1[i];
                           i++;
                }else
                {
                    k--;
                    if(k==0)
                           return arr2[j];
                           j++;
                }
            }
            while(i<n)
            {k--;
                if(k==0)
                           return arr1[i];
                           i++;
            }
            while(j<m){
                k--;
                if(k==0)
                           return arr2[j];
                           j++;
            }
        }
        return -1;
        
        
    }
}