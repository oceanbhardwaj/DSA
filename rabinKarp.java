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
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
       ArrayList<Integer> a=new ArrayList<>();
       int n=pat.length();
       for(int i=0;i<=S.length()-n;i++){
             //System.out.println("hjk");
           int j;
           for( j=0;j<n;j++){
               if(S.charAt(i+j)!=pat.charAt(j))
               break;
           }
           //System.out.println(j);
           if(j==n){
               a.add(i+1);
           }
       }
       if(a.size()==0)
       a.add(-1);
       return a;
    }
}