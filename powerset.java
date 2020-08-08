/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String str="abc";
		String curr="";
		helper(str,0,curr);
	}
	static void helper(String str,int index,String curr)
	{    
	    
	    
	   
	    System.out.println(curr);
	    for(int i=index;i<str.length();i++)
	    {
	        curr+=str.charAt(i);
	        helper(str,i+1,curr);
	        curr=curr.substring(0,curr.length()-1);}
	        return;
	        
	    }
	}
