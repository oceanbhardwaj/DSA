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
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
       ArrayList<String>res=new ArrayList();
       getNBitBinary(res,N,0,0,"");
       return res;
    }
    public void getNBitBinary( ArrayList<String>res,int N,int ones,int zeroes,String output){
        if(output.length()==N)
        {
            res.add(output);
            return;
        }
        //ones
        if(ones<N){
            getNBitBinary(res,N,ones+1,zeroes,output+"1");
        }
        if((ones-zeroes)>=1){
         getNBitBinary(res,N,ones,zeroes+1,output+"0");   
        }
    }
}