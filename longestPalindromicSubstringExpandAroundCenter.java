class Solution {
    public int longestPalindromeSubseq(String s) {
        int max=1;
        boolean dp[][]=new boolean[s.length()][s.length()];
        //one length
        for(int i=0;i<s.length();i++){
           dp[i][i]=true;
        }
        
        //two length
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                max=2;
            }
        }
        //greater than 2
        for(int k=3;k<s.length();k++){ //length
            for(int i=0;i<=s.length()-k;i++){
                int j=i+k-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    max=Math.max(max,k);
                }
            }
        }
        return max;
    }
}
-------------------------------------------------------------------------------
class Solution {
    public String longestPalindrome(String s) {
        int low=0;
        int high=0;
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            low=i-1;
            high=i+1;
            while(low>=0 && s.charAt(low)==s.charAt(i))
            {
                low--;
            }
            while(high<s.length() && s.charAt(high)==s.charAt(i))
            {
                high++;
            }
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
            }
            if(high-low-1>max){
                max=high-low-1;
                start=low+1;
            }
        }
        return s.substring(start,start+max);
    }
}