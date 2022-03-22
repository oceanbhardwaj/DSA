class Solution {
    public String longestPalindrome(String s) {
        int maxLength=0;
        String maxPalindromeString="";
        for(int start=0;start<s.length();start++){
            for(int j=start;j<s.length();j++){
                String strToBeChecked=s.substring(start,j+1);
                if(isPalindrome(strToBeChecked) && maxLength<strToBeChecked.length()){
                    maxLength=Math.max(maxLength,strToBeChecked.length());
                    maxPalindromeString=strToBeChecked;
                }
            }
        }
        return maxPalindromeString;
    }
    
    public boolean isPalindrome(String s){
        if(s.length()<=1)
            return true;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
        end--;
        }
        return true;
    }
}