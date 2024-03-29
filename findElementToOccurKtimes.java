// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class GfG { 
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int[] arr = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
		    
		    Solution obj = new Solution();
		    System.out.println(obj.firstElementKTime(arr, n, m));
		}
	}
}
// } Driver Code Ends


class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        int ans=0;
        int index=Integer.MAX_VALUE;
        int val=-1;
        for(int i=0;i<n;i++){
            ans=1;
             if(ans==k && index>i)
                {
                    index=i;
                    val=a[i];
                }
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                ans++;
                if(ans==k && index>j)
                {
                    index=j;
                    val=a[j];
                }
            }
        }
        return val;
    } 
}