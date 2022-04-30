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
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
       ArrayList<String> res=new ArrayList<>();
       call(S,res,"",0);
       return res;
    }
    public void call(String S,ArrayList<String> res,String output,int i){
        if(i>=S.length())
        {
            res.add(output);
            return;
        }
        output=output+S.charAt(i);
        String str=output;
        if(i!=S.length()-1)
        {
           //output=output+" ";
           str=str+" ";
           call(S,res,str,i+1);
        }
        call(S,res,output,i+1);
        
        
        
    }
    
}