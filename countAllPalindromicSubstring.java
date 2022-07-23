class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ans=s.substring(i,j);
                if(isPalindrome(ans))
                    count++;
            }
        }
        return count;
    }
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
    }
}
---------------------------------------------------
class Solution {
    public int countSubstrings(String s) {
        int count=0;
        boolean dp[][]=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
           dp[i][i]=true;
            count++;
            }
        //two length
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                
            {
                dp[i][i+1]=true;
                count++;
            }
        }
        //more than 3 length
        int last=0;
        for(int i=3;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++)
            {  last=j+i-1;
            if(s.charAt(j)==s.charAt(last) && dp[j+1][last-1])
            {
                dp[j][last]=true;
                count++;
            }
            }
        }
        return count;
        
    }
}