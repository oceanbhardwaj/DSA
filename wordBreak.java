class Solution {
    HashMap<String,Boolean>h=new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.equals(""))
            return true;
        if(h.containsKey(s))
            return  h.get(s);
        
        for(int i=0;i<s.length();i++){
            String sb=s.substring(0,i+1);
            if(wordDict.contains(sb) && wordBreak(s.substring(i+1),wordDict))
            {
                h.put(s,true);
                return true;
            }
        }
        h.put(s,false);
        return false;
    }
}