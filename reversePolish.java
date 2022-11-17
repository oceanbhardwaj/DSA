class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equalsIgnoreCase("+"))
            {
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }else if(tokens[i].equalsIgnoreCase("-"))
            { int a=s.pop();
                int b=s.pop();
                s.push(b-a);
                
            }else if(tokens[i].equalsIgnoreCase("*")){
                 int a=s.pop();
                int b=s.pop();
                s.push(a*b);
            }else if(tokens[i].equalsIgnoreCase("/")){
                 int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }
            else
                s.push(Integer.parseInt(tokens[i]));
        }
        return s.peek();
    }
}