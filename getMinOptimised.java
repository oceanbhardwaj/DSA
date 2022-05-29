// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s;

    /*returns min element from stack*/
    GfG(){
        minEle=Integer.MAX_VALUE;
        s=new Stack<Integer>();
    }
    int getMin()
    {
    if(s.isEmpty())
    return -1;
    return minEle;

    }
    
    /*returns poped element from stack*/
    int pop()
    {
        int d=0;
    if(s.isEmpty())
    return -1;
    if(!s.isEmpty() && minEle<s.peek())
    return s.pop();
    else
    {
       //next min
       d=minEle;
       minEle=2*minEle-s.peek();
       s.pop();
    }
    return d;
    
    }

    /*push element x into the stack*/
    void push(int x)
    {
if(s.isEmpty()){
    minEle=x;
    s.push(x);
}else if(!s.isEmpty() && x>minEle)
{
    s.push(x);
}else{
    int pushed=2*x-minEle;
    s.push(pushed);
    minEle=x;
}
    }	
}

