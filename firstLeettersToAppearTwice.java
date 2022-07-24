class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!h.containsKey(s.charAt(i)))
                h.put(s.charAt(i),1);
            else
                return s.charAt(i);
        }
        return 'a';
    }
}