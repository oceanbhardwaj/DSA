class Solution {
    public String robotWithString(String s) {
        Stack<Character>stack=new Stack<>();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            stack.push(ch);
            freq[ch-'a']--;
            while(!stack.isEmpty() && stack.peek()<=getMinChar(freq)){
                sb.append(stack.pop());
            }
            
        }
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public char getMinChar(int freq[]){
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
                return (char)(i+'a');
        }
        return 'a';
    }
}