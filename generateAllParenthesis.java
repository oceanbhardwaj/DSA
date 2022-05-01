// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        List<String> res=new ArrayList();
        getAllParenthesis(res, n,n,"");
        return res;
    }
    public void getAllParenthesis(List<String> res,int open,int close,String output){
        if(open<=0 && close<=0)
        {
            //System.out.println("vbnm");
            res.add(output);
            return;
        }
        
        //open
        if(open>0)
        getAllParenthesis(res,open-1,close,output+"(");
        if(close>open){
            getAllParenthesis(res,open,close-1,output+")");
        }
    }
}