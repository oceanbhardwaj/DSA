class Solution {
    public String longestPalindrome(String s) {
      boolean res[][]=new boolean[s.length()][s.length()];
        int max=0;
        int start=0;
        int end=0;
        //one length
        int len=s.length();
        for(int i=0;i<s.length();i++){
          res[i][i]=true;
            start=i;
            end=i;
             res[start][end]=true;
            max=1;
        }
        
        //second length
        for(int i=1;i<len;i++){
            if(s.charAt(i)==s.charAt(i-1) ){
                start=i-1;
                end=i;
                res[start][end]=true;
                max=2;
            }
        }
        
        //more than 2 length
    
        for(int k=3;k<=len;k++){
            for(int j=0;j<=len-k;j++){
            int endPoint=j+k-1;
            if(s.charAt(j)==s.charAt(endPoint) && res[j+1][endPoint-1] ){
             res[j][endPoint]=true;
                start=j;
                end=endPoint;
                max=Math.max(max,k);
               
            }
            }
           
        }
        return s.substring(start,end+1);
        
    }
}