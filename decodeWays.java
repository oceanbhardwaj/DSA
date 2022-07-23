class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(s,0,dp);
        
    }
    public int helper(String s,int i,int dp[]){
        if(i==s.length())
            return 1;
        if(s.charAt(i)=='0')
            return 0;
        if(i==s.length()-1)
            return 1; 
       if(dp[i]!=-1)
           return dp[i];
        int oneVar=helper(s,i+1,dp);
        int twoVar=0;
        if(Integer.parseInt(s.substring(i,i+2))<=26)
            twoVar=helper(s,i+2,dp);
        return dp[i]=oneVar+twoVar;
    }
}