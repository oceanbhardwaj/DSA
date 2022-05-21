class Solution {
    public int myAtoi(String s) {
       
        s=s.trim();
        if(s.length()==0)
            return 0;
         int n=s.length();
        long res=0;
        int sum=0;
        int base=10;
        int i=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+')
        {i++;
        
        }
       for( ;i<n;i++){
           if(Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
           res=res*base+digit;
         if(s.charAt(0)=='-' && (-1*res)<Integer.MIN_VALUE)
             return Integer.MIN_VALUE;
               else if(s.charAt(0)!='-' && res>Integer.MAX_VALUE)
                   return Integer.MAX_VALUE;
        }else
           break;}
        if(s.charAt(0)=='-')
            return (int)(-1*res);
        return (int)res;
    }
}