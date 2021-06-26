/*package whatever //do not write package name here */

import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
			int b=sc.nextInt();
				int c=sc.nextInt();
				int d=sc.nextInt();
				long cyan=a;
				long red=0;
				long count=0;
				if(b>=c*d)
				System.out.println("-1");
				else{
				while(true)
				{
				    if(cyan<=(long )d*red)
				    break;
				    cyan=cyan+b;
				    red=red+c;
				    count++;
				}
				
				System.out.println(count);
				}
	}
}