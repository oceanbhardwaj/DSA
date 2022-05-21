class Solution {
    public int strStr(String haystack, String needle) {
       // return haystack.indexOf(needle);
        int n=needle.length();
        if(n==0)
            return 0;
        for(int i=0;i<=haystack.length()-n;i++){
            String s=haystack.substring(i,i+n);
            if(s.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}