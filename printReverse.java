class per{

  
 
	//public String name;
public static void main(String[] args) {
   //String op="";
	printReverse("ocean");

	

}
static void printReverse(String s)

{   // System.out.println("iii");
	if(s.length()<=0)
		return;
	System.out.print(s.charAt(s.length()-1));
   s=s.substring(0,s.length()-1);
   printReverse(s);
}
}