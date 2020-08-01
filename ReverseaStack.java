import java.util.*;
class ReverseaStack
{  
	public static void main(String[] args) 
	{
		Stack<Integer> s= new Stack<Integer>();
		s.push(5);
		s.push(0);
		s.push(1);
		s.push(2);
		reverse(s,s.size());

while(!s.isEmpty())
{
	System.out.println(s.peek()+" ");
	s.pop();
}




	}
	static void reverse(Stack<Integer> s,int n)
	{
		if(s.size()==0)
        {
return;
        }
      int  ele=s.pop();
        reverse(s,s.size());
        insert(s,ele);


	}
	static void insert(Stack<Integer> s,int ele)

	{
		if(s.size()==0)
		{
			s.push(ele);
			return;
		}
		int temp=s.pop();
		insert(s,ele);
		s.push(temp);
	}
}