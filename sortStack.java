//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	 Stack<Integer> s2=new Stack<>();
	  Stack<Integer> s1=new Stack<>();
	  while(!s.isEmpty()){
	      int ele=s.pop();
	      if(s2.isEmpty() || (!s2.isEmpty() && s2.peek()<ele))
	      s2.push(ele);
	      else{
	          while(!s2.isEmpty() && s2.peek()>=ele){
	              s1.push(s2.pop());
	          }
	          s2.push(ele);
	          while(!s1.isEmpty()){
	              s2.push(s1.pop());
	          }
	      }
	  }
	  return s2;
	}
}