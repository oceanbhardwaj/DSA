class Solution {
    ArrayList<String> NBitBinary(int N) {
       ArrayList<String> res=new ArrayList<>();
       dfs(N,0,0,"",res);
       return res;
    }
    public void dfs(int N,int zeroes,int ones,String ans,ArrayList<String> res)
    {
        if(N==0)
        {
            res.add(ans);
            return;
        }
        String oneString=ans+"1";
        dfs(N-1,zeroes,ones+1,oneString,res);
         if(ones>zeroes)
         {
             String zeroString=ans+"0";
             dfs(N-1,zeroes+1,ones,zeroString,res);
         }
        
        
        
        
        
    }
}