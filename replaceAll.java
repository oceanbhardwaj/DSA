class Solution {
    public String modifyString(String s) {
        if(s.length()==0)
            return s;
       
        if(s.length()==1 && s.charAt(0)=='?')
            return "a";
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='?')
            {
                for(int c=97;c<=122;c++)
                {
                    if(i==0 && i+1<s.length() && ch[i+1]!=(char)c )
                    {ch[i]=(char)c;
                    break;}
               if(i>0 && i<s.length() )
               {
                   if(i==s.length()-1)
                   {
                       if(ch[i-1]!=(char)c)
                       {ch[i]=(char)c;
                        break;}
                       else
                           continue;
                   }
               
                      
                  if( (ch[i-1]!=(char)c && ch[i+1]!=(char)c))
                        {ch[i]=(char)c;
                    break;}
               }
                      
                    
                }
            }
        }
        String str=String.valueOf(ch);
        return str;
    }
}