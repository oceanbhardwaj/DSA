/*package whatever //do not write package name here */

import java.util.*;

class GFG {
  static  HashSet<String> h=new HashSet<>();
	public static void main (String[] args) {
		String str="aaabc";
		String curr="";
		helper(str,0,curr);
		
		for(String s:h)
System.out.println(s);		
		
		
		
		
		
	}
	static void helper(String str,int index,String curr)
	{    
	    
	    
	   
	    h.add(curr);
	    for(int i=index;i<str.length();i++)
	    {
	        curr+=str.charAt(i);
	        helper(str,i+1,curr);
	        curr=curr.substring(0,curr.length()-1);}
	        return;
	        
	    }
	}
