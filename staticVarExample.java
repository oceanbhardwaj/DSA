/*package whatever //do not write package name here */

import java.io.*;
class StaticVariableExample{
    static int count=0;
    StaticVariableExample(){
        count++;
    }
    public static int getCount(){
        return count;
    }



	public static void main (String[] args) {
	    StaticVariableExample s=new StaticVariableExample();
	     StaticVariableExample s1=new StaticVariableExample();
	      StaticVariableExample s2=new StaticVariableExample();
	    System.out.println(StaticVariableExample.getCount());
	      System.out.println(s.getCount());
	    
		
	}
}