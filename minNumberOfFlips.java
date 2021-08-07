class Solution {
    public int minFlips(String S) {
       int min=Integer.MAX_VALUE;
       //first is 0
       int f=0;
       int count=0;
       for(int i=0;i<S.length();i++)
       {
           
           if(S.charAt(i)-'0'!=f)
           count++;
        f=f^1;
           
       }
      // System.out.println(count);
       min=Math.min(min,count);
       count=0;
       f=1;
       for(int i=0;i<S.length();i++)
       {
           if(S.charAt(i)-'0'!=f)
           count++;
           f=f^1;
           
       }
        //System.out.println(count);
       min=Math.min(min,count);
       return min;
       
    }
}