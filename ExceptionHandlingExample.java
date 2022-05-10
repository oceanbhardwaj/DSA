/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		try{
		    System.out.println("start");
		    System.out.println(10/0);
		     System.out.println("end");
		}
		catch(Exception e){
		     StringWriter sw = new StringWriter();
		     PrintWriter pw = new PrintWriter(sw);
		     e.printStackTrace(pw);
		     String error=sw.toString();
		    System.out.println("caught"+error);
		}
	}
}