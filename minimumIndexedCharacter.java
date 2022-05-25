// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<patt.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==patt.charAt(i)){
                   min=Math.min(min,j);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}
  // } Driver Code Ends
  
  -----------------------------------------------------------------------------------------
  // { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
       HashMap<Character,Integer> h=new HashMap<>();
       for(int i=0;i<str.length();i++){
          if(!h.containsKey(str.charAt(i))){
              h.put(str.charAt(i),i);
          }
           
       }
       int min=Integer.MAX_VALUE;
       for(int i=0;i<patt.length();i++){
           char ch=patt.charAt(i);
           if(h.containsKey(ch)){
               min=Math.min(min,h.get(ch));
           }
       }
       return min==Integer.MAX_VALUE?-1:min;
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}
  // } Driver Code Ends