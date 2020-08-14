import java.util.*;
class PhoneDigit
{
	public static void main(String[] args) {
		String s[]={"","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String str="234";
		ArrayList<String> a=new ArrayList<>();
		Queue<String> q1=new LinkedList<>();
		Queue<String> q2=new LinkedList<>();
		int index=Integer.parseInt(str.charAt(0)+"");
     	String s1=s[index];
     	for(int j=0;j<s1.length();j++)
     	{
     		q1.add(String.valueOf(s1.charAt(j)));
     	}

		helper(str,s,a,q1,q2);
		//System.out.println(a.size());
		for(String i1:a)
		{
			System.out.println(i1);
		}
	}
	public static void helper(String str,String s[],ArrayList<String> a,Queue <String> q1,Queue<String> q2)
	{
     for(int i=1;i<str.length();i++)
     {
     	int index=Integer.parseInt(str.charAt(i)+"");
     	String s2=s[index];
     	while(!q1.isEmpty())
     	{
          String s3=q1.remove();
          for(int k=0;k<s2.length();k++)
          {
          	String s4=s3+(s2.charAt(k)+"");
          	q2.add(s4);
          }
     	}
     	Queue<String> temp=q1;
     	q1=q2;
     	q2=temp;
     	



     }
     while(!q1.isEmpty())
     {
     	a.add(q1.remove());
     }
	}
}