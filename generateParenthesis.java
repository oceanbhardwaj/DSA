class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs(n,n,res,"");
        return res;
    }
    public void dfs(int open,int close,List<String> res,String ans)
    {
     if(open==0 && close ==0)
     {
         res.add(ans);
         return;
     }
        if(open!=0)
        {
            String openString=ans+"(";
            dfs(open-1,close,res,openString);
        }
        if(close>open)
        {
            String closeString=ans+")";
            dfs(open,close-1,res,closeString);
        }
    
    
    
    
    
    }
}