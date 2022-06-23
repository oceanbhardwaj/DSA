// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int res[][]=new int[m][n];
        //swap first and third
        
            for(int j=0;j<(m/2);j++){
                for(int i=0;i<n;i++){
            int temp=matrix[i][m-j-1];
            matrix[i][m-j-1]=matrix[i][j];
            matrix[i][j]=temp;
            }
        }
       // System.out.println(Arrays.deepToString(matrix));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[j][i];
            }
        }
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               matrix[i][j]=res[i][j];
           }
       }
        
        }
    }
------------------------------------------------------------------------------------
// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int res[][]=new int[m][n];
        //swap first and third
        
            for(int j=0;j<(m/2);j++){
                for(int i=0;i<n;i++){
            int temp=matrix[i][m-j-1];
            matrix[i][m-j-1]=matrix[i][j];
            matrix[i][j]=temp;
            }
        }
       // System.out.println(Arrays.deepToString(matrix));
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               swap(i,j,matrix);
           }
       }
        
        }
        public static void swap(int i,int j,int matrix[][]){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }

