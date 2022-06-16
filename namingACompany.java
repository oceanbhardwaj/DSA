class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String> h=new HashSet<>();
        for(String s:ideas)
            h.add(s);
        int freq[][]=new int[26][26];
        for(String s:ideas){
            int first=s.charAt(0)-'a';
            for(char j='a';j<='z';j++){
                String str=j+s.substring(1);
                if(!h.contains(str)){
                    freq[first][j-'a']++;
                }
            }}
            long ans=0;
            for(char i='a';i<='z';i++){
                for(char j='a';j<='z';j++){
ans+=((long)freq[i-'a'][j-'a']*(long)freq[j-'a'][i-'a']);}
            }
         return ans;
        }
       
    
}