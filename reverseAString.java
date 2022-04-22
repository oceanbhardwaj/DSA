/*package whatever //do not write package name here */

import java.io.*;
//REVERSE A STRING
class GFG {
	public static void main (String[] args) {
		String s="OCEAN";
		System.out.println(reverseString(s,s.length()-1));
	}
	public static String reverseString(String s,int i){
	    if(i<0)
	    return "";
	    return s.charAt(i)+reverseString(s,i-1);
	}
}
--------------------------------------------------------------------------------------------------------
/*package whatever //do not write package name here */

import java.io.*;
//REVERSE A STRING
class GFG {
	public static void main (String[] args) {
		String s="OCEAN";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s){
	    if(s.isEmpty())
	    return "";
	    return s.charAt(s.length()-1)+reverseString(s.substring(0,s.length()-1));
	}
}