//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.rank(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int rank(String S){
       int res=0;
       int arr[]=new int[26];
       long fact[]=new long[S.length()+1];
       fact[0]=1;
       fact[1]=1;
       int mod=1000003;
       for(int i=2;i<S.length();i++){
           fact[i]=(((fact[i-1])%mod)*i)%mod;
       }
       int n=S.length();
       //filling less occurance
       for(int i=0;i<S.length();i++){
           arr[S.charAt(i)-'a']++;
             if(arr[S.charAt(i)-'a']>1)
               return 0;
       }
       for(int i=0;i<S.length();i++){
           
           char ch=S.charAt(i);
           int noOfWordsLessThanCh=0;
           for(int j=0;j<256;j++){
               if(ch==(char)(j+'a'))
              // if(j==ch)
               break;
             
               if(arr[j]>0)
               noOfWordsLessThanCh++;
               
               
           }
           arr[S.charAt(i)-'a']=0;
           res+=(noOfWordsLessThanCh*fact[n-1-i])%mod;
       }
       return (res+1)%mod;
    }
}