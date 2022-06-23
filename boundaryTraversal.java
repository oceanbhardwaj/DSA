// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int matrix[][] = new int[n][m];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(matrix, n, m);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> a=new ArrayList<>();
        int i=0;
       int j=0;
       if(n==1){
           while(j<m){
               a.add(matrix[0][j]);
               j++;
           }
       }else if(m==1){
           j=0;
           while(i<n){
               a.add(matrix[i][0]);
               i++;
               
           }
       }else{
       
        //first row
        for( j=0;j<m-1;j++){
            a.add(matrix[i][j]);
        }
        //last col
         j=m-1;
       
        for( i=0;i<n-1;i++){
            a.add(matrix[i][j]);
        }
        i=n-1;
       
        for(j=m-1;j>0  ;j--){
            a.add(matrix[i][j]);
        }
       
        j=0;
        for(i=n-1;i>0;i--)
        a.add(matrix[i][j]);
      
    }
      return a;
    }
}
