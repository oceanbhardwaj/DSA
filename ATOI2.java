class Solution {
    public int myAtoi(String s) {
        int i=0;
        
        //removing space
        while(i<s.length() && s.charAt(i)==' ')
            i++;
        int start=i;
        boolean neg=false;
        //checking negative
        if(i<s.length() && s.charAt(i)=='-')
        {neg=true;
         i++;
        }else if(i<s.length() && s.charAt(i)=='+')
            i++;
        //removing zero
          while(i<s.length() && s.charAt(i)=='0')
            i++;
        int base=10;
        long ans=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
            int d=s.charAt(i)-'0';
            ans=ans*base+d;
                if(s.charAt(start)!='-' && ans>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if(s.charAt(start)=='-' && -1*ans<Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            //base=base*10;
            i++;}
            else
                break;
            
        }
      if(neg)
          ans=-1*ans;
        // if(ans>Integer.MAX_VALUE)
        //     return Integer.MAX_VALUE;
        // else if(ans<Integer.MIN_VALUE)
        //     return Integer.MIN_VALUE;
        return (int)ans;
    }
}