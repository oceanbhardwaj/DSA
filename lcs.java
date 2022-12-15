class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return helper(text1,text2,text1.length(),text2.length());
    }
    public int helper(String X,String Y,int n,int m){
        if(n<=0 || m<=0)
        return 0;
        if(X.charAt(n-1)==Y.charAt(m-1))
        return 1+helper(X,Y,n-1,m-1);

        return Math.max(helper(X,Y,n,m-1),helper(X,Y,n-1,m));
    }
}

/***********************************************************************************************/
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        HashMap<String,Integer> map=new HashMap();
        return helper(text1,text2,text1.length(),text2.length(),map);
    }
    public int helper(String X,String Y,int n,int m,HashMap<String,Integer> map){
        if(n<=0 || m<=0)
        return 0;
        String ans=n+"LEETCODE"+m;
        if(map.containsKey(ans))
        return map.get(ans);
        int d=0;
        if(X.charAt(n-1)==Y.charAt(m-1)){
         d= 1+helper(X,Y,n-1,m-1,map);
         map.put(ans,d);
         return d;
        }

        d= Math.max(helper(X,Y,n,m-1,map),helper(X,Y,n-1,m,map));
        map.put(ans,d);
        return d;
    }
}