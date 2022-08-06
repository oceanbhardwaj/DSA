class Solution {
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !isVowel(ch[i]))
                i++;
            while(i<j && !isVowel(ch[j]))
                j--;
            if(i<j){
                char c=ch[i];
                ch[i]=ch[j];
                ch[j]=c;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
    public boolean isVowel(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' ||c=='i' || c=='o' || c=='u')
            return true;
        
        
        
        return false;
    }
}