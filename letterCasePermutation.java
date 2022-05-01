class Solution {
    public List<String> letterCasePermutation(String s) {
         List<String> res=new ArrayList();
        gettingLetterCasePermutation(s,res,0,"");
        return res;
    }
    public void gettingLetterCasePermutation(String s, List<String> res,int i,String output){
        if(i>=s.length())
        {
            res.add(output);
            return;
        }
          String str=s.charAt(i)+"";
        str=str.toLowerCase();
        
        if(!Character.isDigit(s.charAt(i))){
           gettingLetterCasePermutation(s,res,i+1,output+str) ;
            String str1=s.charAt(i)+"";
            str1=str1.toUpperCase();
          
           gettingLetterCasePermutation(s,res,i+1,output+str1) ;

      }
       else
       gettingLetterCasePermutation(s,res,i+1,output+s.charAt(i)) ;

    }
}