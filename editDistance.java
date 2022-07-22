class Solution {
    public int minDistance(String word1, String word2) {
        return call(word1,word2,word1.length(),word2.length());
    }
    public int call(String X,String Y,int n,int m){
            if(n==0 && m==0)
                return 0;
        if(n==0)
            return m;
        if(m==0)
            return n;
        if(X.charAt(n-1)==Y.charAt(m-1))
            return call(X,Y,n-1,m-1);
        else
        {
           //insert
            int insertCall=call(X,Y,n,m-1);
            //delete
            int deleteCall=call(X,Y,n-1,m);
            //replace
            int replaceCall=call(X,Y,n-1,m-1);
            
            return 1+Math.min(insertCall,Math.min(deleteCall,replaceCall));
            
        }
    
    
    
    
    }
}
--------------------------------------------------------------------------------------------------------
class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        
        return call(word1,word2,word1.length(),word2.length(),dp);
    }
    public int call(String X,String Y,int n,int m,int dp[][]){
            if(n==0 && m==0)
                return 0;
        if(n==0)
            return m;
        if(m==0)
            return n;
        if(dp[n-1][m-1]!=-1)
            return dp[n-1][m-1];
        if(X.charAt(n-1)==Y.charAt(m-1))
            return dp[n-1][m-1]= call(X,Y,n-1,m-1,dp);
        else
        {
           //insert
            int insertCall=call(X,Y,n,m-1,dp);
            //delete
            int deleteCall=call(X,Y,n-1,m,dp);
            //replace
            int replaceCall=call(X,Y,n-1,m-1,dp);
            
            return dp[n-1][m-1]=1+Math.min(insertCall,Math.min(deleteCall,replaceCall));
            
        }
    
    
    
    
    }
}
---------------------------------------------------------------------------------------------
class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
           
            dp[i][0]=i;
        }
        for(int i=1;i<=m;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}