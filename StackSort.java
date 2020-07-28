import java.util.*;
class StackSort
{
	public static void main(String[] args) 
	{
		Stack<Integer> s= new Stack<Integer>();
		s.push(5);
		s.push(0);
		s.push(1);
		s.push(2);

Stack<Integer> temp= new Stack<Integer>();
while(!s.isEmpty())
{
int val=s.peek();
s.pop();
while(!temp.isEmpty() && temp.peek()>val)
{
 s.push(temp.pop());
}
temp.push(val);
}
while(!temp.isEmpty())
{
	System.out.println(temp.peek());
	temp.pop();
}















	}

}