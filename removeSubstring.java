/*package whatever //do not write package name here */

import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int count=0;
		int i=1;
		while(s.length()>1)
		{ 
		    if(s.charAt(0)!=s.charAt(s.length()-1))
		    {
		        count++;
		        s="";
		        break;
		    }
		    for( i=1;i<s.length();i++)
		    { 
		        if(s.charAt(0)!=s.charAt(i))
		        {
		            s=s.substring(i+1);
		            i=0;
		            count++;
		            break;
		        }
		    }
		    //System.out.println("count :"+count);
		    if(i>=s.length()-1)
		    break;
		  //  if(s.length()>=1)
		  //  break;
		}
		if(s.length()!=0)
		count=-1;
		System.out.println(count);
	}
}