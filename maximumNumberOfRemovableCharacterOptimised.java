class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        
        String S=s;
        int count=0;
        int max=0;
       int l=0;
        int r=removable.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            char ch[]=s.toCharArray();
          
            
              for(int j=0;j<=mid;j++)
              {
                  ch[removable[j]]='/';
              } 
            String str=new String(ch);
            if(isSubsequence(str,p))
            {
               
                max=Math.max(mid+1,max);
                l=mid+1;
            }
            else
                r=mid-1;
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