class Solution {
    public String removeOccurrences(String s, String part) {
        int p=part.length();
        while(s.contains(part))
        {
            for(int i=0;i<=s.length()-p;i++)
            {
                String str=s.substring(i,i+p);
                if(str.equals(part))
                {
                    s=s.substring(0,i)+s.substring(i+p);
                    break;
                }
            }
        }
        return s;
    }
}
/////////////////////////////////
class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
            if(stack.size()>=part.length())
                compareString(stack,part);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
        
        
    }
    public void compareString(Stack<Character> stack,String part)
    {
        StringBuilder sb=new StringBuilder();
        boolean flag=true;
        int size=part.length();
        while(size>0)
        {
            sb.append(stack.pop());
            size--;
        }
        sb.reverse();
        for(int i=0;i<part.length();i++) 
        {
            if(part.charAt(i)!=sb.charAt(i))
            {
                flag=false;
                break;
            }
        }
        if(!flag)
        {
            for(int i=0;i<sb.length();i++)
            {
                stack.push(sb.charAt(i));
            }
        }
    }
}