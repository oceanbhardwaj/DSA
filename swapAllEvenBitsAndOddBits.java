// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    int even_bits_restore=0xAAAAAAAA & n;
	    int odd_bits_restore=0x55555555 & n;
	    even_bits_restore=even_bits_restore>>1;
	    odd_bits_restore=odd_bits_restore<<1;
	    return even_bits_restore | odd_bits_restore;
	}
    
}

// { Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}  // } Driver Code Ends