class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        
        String S=s;
        int count=0;
        int max=0;
       
        for(int i=0;i<removable.length;i++)
        {
            char ch[]=s.toCharArray();
            int d=i;
            
              for(int j=0;j<=d;j++)
              {
                  ch[removable[j]]='/';
              } 
            String str=new String(ch);
            if(isSubsequence(str,p))
            {
               
                max=Math.max(d+1,max);
            }
            else
                break;
        }
            
        
        return max;
        
        
        
        
        
    }
    public boolean isSubsequence(String x,String y)
    {
        int j=0;
        int i=0;
        for( i=0;i<y.length();)
        {
            if(i==y.length())
                return true;
            if(j>=x.length())
                return false;
            if(y.charAt(i)!=x.charAt(j))
            {
                j++;
                continue;
            }
            else
            {
                i++;
                j++;
            }
        }
        return i>=y.length()?true:false;
    }
}