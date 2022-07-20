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