class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<>();
         call(s,0,res,"");
        return res;
    }
    public void call(String s,int start,List<String> res,String ans)
    {
        if(start>=s.length())
        {
            res.add(ans);
            return;
        }
        String cap="";
        String nonCap="";
        if(Character.isAlphabetic(s.charAt(start)))
        {
            cap=ans+(s.charAt(start)+"").toUpperCase();
            nonCap=ans+(""+s.charAt(start)).toLowerCase();
            call(s,start+1,res,cap);
            call(s,start+1,res,nonCap);
        }
        else
        {
            call(s,start+1,res,ans+s.charAt(start));
        }
    }
}