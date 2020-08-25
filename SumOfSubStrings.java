import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i1=0;i1<t;i1++)
		{
		    String s=sc.nextLine();
		    long sum=0;
		long sum1=0;
		for(int i=0;i<s.length()-1;i++)

		{    sum=Long.parseLong(String.valueOf(s.charAt(i)));
			String g=String.valueOf(s.charAt(i));
			for(int j=i+1;j<s.length();j++)
			{
             g=g+s.charAt(j);
              sum=sum+Long.parseLong(g);

			}
			sum1=sum1+sum;
		}
		long n=Long.parseLong(s.charAt(s.length()-1)+"");
		System.out.println(sum1+n);
		}
	}
}