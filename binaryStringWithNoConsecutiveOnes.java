//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long count=0;
    long countStrings(int n) {
        call(n,n,"",n);
      return count; 
    }
    public void call(int ones,int zeroes,String output,int n){
        if(output.length()==n)
        {count++;
        return;}
        
        if(zeroes<=0 && ones<=0)
        return;
        if(output.length()>0 && output.charAt(output.length()-1)=='1')
        {
            //call for only zeroes
            call(ones,zeroes-1,output+'0',n);
        }else{
            call(ones-1,zeroes,output+'1',n);
             call(ones,zeroes-1,output+'0',n);
            
        }
    }
}
---------------------------------------------------------------
class Solution {
    long countStrings(int n) {
       long dp0[]=new long[n];
       long dp1[]=new long[n];
       dp0[0]=1;
       dp1[0]=1;
     final long mod=1000_000_007;
       //No consecutive ones
       for(int i=2;i<n;i++){
           dp0[i]=(dp0[i-1]%mod+dp1[i-1]%mod)%mod;
           dp1[i]=(dp0[i-1])%mod;
       }
       return (dp0[n-1]%mod+dp1[n-1]%mod)%mod;
    }
}
---------------------------------------------------------------
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        long res=0;
        long ocount0=1;
        long ocount1=1;
        long ncount0=0;
        long ncount1=0;
        long mod=1000000009;
        //no consecutive ones
        for(int i=2;i<=n;i++){
            ncount0=(ocount0%mod+ocount1%mod)%mod;
            ncount1=ocount0%mod;
            
            ocount0=ncount0%mod;
            ocount1=ncount1%mod;
        }
        return (ocount0%mod+ocount1%mod)%mod;
    }
}