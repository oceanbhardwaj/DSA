class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex=0;
        if(s.length()==0)
            return true;
        for(int i=0;i<t.length();i++){
            int tChar=t.charAt(i);
            if(s.charAt(sIndex)==tChar)
                sIndex++;
            
            if(sIndex>=s.length())
                break;
        }
        return sIndex>=s.length()?true:false;
    }
}