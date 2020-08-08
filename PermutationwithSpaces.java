/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String str="abc";
		String op=str.substring(0,1);
		str=str.substring(1);
		
		helper(str,op);
	}
	static void helper(String str,String op)
	{
	    if(str.length()==0)
	    {
	        System.out.println(op);
	        return;
	    }
	    String op1=op+" "+str.charAt(0);
	    String op2=op+str.charAt(0);
	    str=str.substring(1);
	    helper(str,op1);
	    helper(str,op2);
	}
}