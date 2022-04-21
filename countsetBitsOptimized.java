// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
     if(n<=0)
     return 0;
     int x=getMaxPower(n);
      int beforeMaxPowerOfTwo=(1<<(x-1))*x;
      int afterTwoPower=n-(1<<(x))+1;
      return beforeMaxPowerOfTwo+afterTwoPower+countSetBits(n-(1<<(x)));
        
    }
    public static int getMaxPower(int n){
        int x=0;
        while((1<<x)<=n)
        x++;
        
        return x-1;
    }
}

// { Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}
  // } Driver Code Ends