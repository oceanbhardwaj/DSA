//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}



// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static HashMap<String,Integer> h=new HashMap<>();
    static int eggDrop(int n, int k) 
	{
	   if(n<=1 || k<=1)
	    return k;
	    String ans=n+"code"+k;
	    if(h.containsKey(ans))
	    return h.get(ans);
	   int min=Integer.MAX_VALUE;
	   for(int i=1;i<=k;i++){
	       int temp=1+Math.max(eggDrop(n-1,i-1),eggDrop(n,k-i));
	       min=Math.min(min,temp);
	   }
	    h.put(ans,min);
	    return min;
	}
	
}
---------------------------------------------------------------------------------
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}



// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static HashMap<String,Integer> h=new HashMap<>();
    
    static int eggDrop(int n, int k) 
	{
	   if(n<=1 || k<=1)
	    return k;
	    String ans=n+"code"+k;
	    if(h.containsKey(ans))
	    return h.get(ans);
	   int min=Integer.MAX_VALUE;
	   for(int i=1;i<=k;i++){
	       String isBreak=(n-1)+"code"+(i-1);
	       String isNotBreak=n+"code"+(k-i);
	       int low=0;
	       int high=0;
	       if(h.containsKey(isBreak))
	       low=h.get(isBreak);
	       else
	       low=eggDrop(n-1,i-1);
	        if(h.containsKey(isNotBreak))
	       high=h.get(isNotBreak);
	       else
	       high=eggDrop(n,k-i);
	       int temp=1+Math.max(low,high);
	       min=Math.min(min,temp);
	   }
	    h.put(ans,min);
	    return min;
	}
	
}