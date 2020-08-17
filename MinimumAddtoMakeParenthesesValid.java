class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
                s.push(S.charAt(i));
            else if(!s.isEmpty() && s.peek()=='(')
                s.pop();
            else
                s.push(S.charAt(i));
        }
        return s.size();
    }
}