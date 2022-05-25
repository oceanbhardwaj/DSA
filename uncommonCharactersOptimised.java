// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
       int count[]=new int[26];
       for(int i=0;i<A.length();i++){
           count[A.charAt(i)-'a']=1;
       }
       for(int i=0;i<B.length();i++){
           if(count[B.charAt(i)-'a']==1 || count[B.charAt(i)-'a']==-1){
               count[B.charAt(i)-'a']=-1;
           }else
           count[B.charAt(i)-'a']=2;
       }
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<26;i++){
           if(count[i]==1 ||count[i]==2)
           sb.append((char)(i+'a'));
       }
       if(sb.toString().length()==0)
       sb.append("-1");
       return sb.toString();
    }
}