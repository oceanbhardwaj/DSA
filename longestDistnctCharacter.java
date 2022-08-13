//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
       HashMap<Character,Integer> h=new HashMap<>();
       int start=0;
       int max=0;
       for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           if(h.containsKey(ch) && h.get(ch)>=start){
              
               start=h.get(ch)+1;
           }
           h.put(ch,i);
            max=Math.max(i-start+1,max);
       }
        return max;
    }
}