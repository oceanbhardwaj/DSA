// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
       Stack<Character> s=new Stack<>();
       StringBuffer sb=new StringBuffer();
       for(int i=0;i<exp.length();i++){
           char ch=exp.charAt(i);
           if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
               sb.append(ch);
           }else{
               if(ch=='(')
               s.push('(');
               else if(ch==')'){
                   while(!s.isEmpty() && s.peek()!='(')
                   sb.append(s.pop());
                   
                   //if(!s.isEmpty())
                   s.pop();
                   
                  
               }else{
                   while(!s.isEmpty() && prec(ch)<=prec(s.peek()))
                   sb.append(s.pop());
                   
                   s.push(ch);
               }
           }
       }
       while(!s.isEmpty()){
           sb.append(s.pop());
           
       }
       return sb.toString();
    }
    public static int prec(char ch){
        if(ch=='^')
        return 3;
        if(ch=='*' || ch=='/')
        return 2;
        else if (ch=='+' || ch=='-')
        return 1;
        return -1;
        
    }
}