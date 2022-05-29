=// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        int ans=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(Character.isDigit(ch))
            s.push(ch-'0');
            else
            {
                if(s.size()>=2){
                    int s2=s.pop();
                    int s1=s.pop();
                    if(ch=='*')
                    s.push(s1*s2);
                    else if(ch=='-')
                    s.push(s1-s2);
                    else if(ch=='+')
                    s.push(s1+s2);
                    else if(ch=='/')
                    s.push(s1/s2);
                    
                }
            }
        }
        return s.peek();
    }
}