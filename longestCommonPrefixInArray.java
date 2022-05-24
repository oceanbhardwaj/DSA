// { Driver Code Starts
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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
       StringBuffer sb=new StringBuffer();
      char ch[]=arr[0].toCharArray();
      for(int i=0;i<ch.length;i++){
          char c1=ch[i];
          boolean flag=true;
          for(int j=1;j<n;j++){
              if(i<arr[j].length()){
             char c2=arr[j].charAt(i);
             if(c1!=c2)
             flag=false;
          }else
          flag=false;
      }
      if(flag)
      sb.append(c1);
    }
    if(sb.toString().length()==0)
    sb.append("-1");
    return sb.toString();
}
}