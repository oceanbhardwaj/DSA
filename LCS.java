class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<String,Integer> h=new HashMap<>();
        return LCS(text1,text2,text1.length(),text2.length(),h);
    }
    public int LCS(String X,String Y,int n,int m,HashMap<String,Integer> h){
        if(n==0 || m==0)
            return 0;
        String ans=n+"leet"+m;
        if(h.containsKey(ans))
            return h.get(ans);
        if(X.charAt(n-1)==Y.charAt(m-1))
            h.put(ans,1+LCS(X,Y,n-1,m-1,h));
        else
            h.put(ans,Math.max(LCS(X,Y,n,m-1,h),LCS(X,Y,n-1,m,h)));
        return h.get(ans);
    }
}
--------------------------------------------------------------------------------
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       int dp[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return LCS(text1,text2,text1.length(),text2.length(),dp);
    }
    public int LCS(String X,String Y,int n,int m,int dp[][]){
        if(n==0 || m==0)
            return 0;
       if(dp[n-1][m-1]!=-1)
           return dp[n-1][m-1];
        if(X.charAt(n-1)==Y.charAt(m-1))
         return dp[n-1][m-1]= 1+LCS(X,Y,n-1,m-1,dp);
        else
         return dp[n-1][m-1]=Math.max(LCS(X,Y,n,m-1,dp),LCS(X,Y,n-1,m,dp));
      
    }
} 
-----------------------------------------------------------------------------
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}