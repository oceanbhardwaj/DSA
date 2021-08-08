class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
         dfs(s,res,new ArrayList<String>());
        return res;
       
    }
    public void dfs(String s,List<List<String>> res,ArrayList<String> a)
    {
        if(s.length()==0)
        {
            res.add(a);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            String left=s.substring(0,i+1);
            String right=s.substring(i+1);
             if(isPalindrome(left))
            {
               
                ArrayList<String> aa=new ArrayList<String>(a);
                 aa.add(left);
               dfs(right,res,aa); 
            }
           
        }
    }
    public boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
         if(str.charAt(left)!=str.charAt(right))
             return false;
            left++;
            right--;
        }
        return true;
    }
}