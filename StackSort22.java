import java.util.*;
class StackSort22
{ //static int x;
	public static void main(String[] args) 
	{
		Stack<Integer> s= new Stack<Integer>();
		s.push(5);
		s.push(0);
		s.push(1);
		s.push(2);
		    sort(s);
while(!s.isEmpty())
{
	System.out.println(s.peek()+" ");
	s.pop();
}



		}


static void sort(Stack<Integer> s)
{
if(!s.isEmpty())
	{int x=s.pop();
sort(s);
insertsort(s,x);}}

static  void insertsort(Stack<Integer> s,int x)
{
	if(s.isEmpty() || s.peek()<x)
	{
		s.push(x);
		return;

	}
	int ele=s.pop();
	insertsort(s,x);
	s.push(ele);
}





}


