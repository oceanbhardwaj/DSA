// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        int len=0;
        int i=0;
        int lps[]=new int[s.length()];
        for( i=1;i<s.length();){
            if(s.charAt(i)==s.charAt(len)){
               len++;
                 lps[i]=len;
                  i++;
            }else {
                if(len==0){
                    i++;
                }else{
                    len=lps[len-1];
                }
            }
        }
        int max=0;
        for( i=0;i<s.length();i++){
        max=Math.max(max,lps[i]);
        }
        return lps[s.length()-1];
    }
}