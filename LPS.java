class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        int start=0;
        int max=0;
        for(int i=0;i<n;i++) //one length
        {
            dp[i][i]=true;
            start=i;
            max=1;
        }
        //second length
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                dp[i][i+1]=true;
                max=2;
                start=i;
            }
        }
        //more than two length
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1; //end point
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
                {
                    dp[i][j]=true;
                   if(j-i+1>max)
                   {
                       max=j-i+1;
                       start=i;
                   }
                }
            }
        }
        return s.substring(start,start+max);
        
    }
}