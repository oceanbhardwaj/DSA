// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
             int matrix[][] = new int[n][n];
            String str[] = read.readLine().trim().split("\\s+");
            int k =0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] = Integer.parseInt(str[k++]);
            }
            Solution ob = new Solution();
            System.out.println(ob.findMinOperation(matrix,n));
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    static int findMinOperation(int matrix[][], int n)
    {
        int sumRow[]=new int[matrix.length];
        int sumCol[]=new int[matrix[0].length];
        int diff=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sumRow[i]+=matrix[i][j];
                sumCol[j]+=matrix[i][j];
            }
        }
        int maxSum=0;
        for(int i=0;i<n;i++){
          maxSum=Math.max(maxSum,Math.max(sumRow[i],sumCol[i]));  
        }
        int i=0;int j=0;
        while(i<n && j<n){
             diff=Math.min(maxSum-sumRow[i],maxSum-sumCol[j]);
            count+=diff;
            sumRow[i]+=diff;
            sumCol[j]+=diff;
            if(sumRow[i]==maxSum)
            i++;
            if(sumCol[j]==maxSum)
            j++;
        }
        return count;
        
    }
}