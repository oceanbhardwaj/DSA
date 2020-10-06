class Solution {
    public String reorderSpaces(String text) {
        int spaces=0;
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)==' ')
                spaces++;
        }
        String s=text.trim();
        s=s.replaceAll("\\s+"," ");
        String str[]=s.split(" ");
        int n=str.length;
         int d=0;
        int mod=0;
        if(n==1)
        { s=str[0];
         mod=spaces;
         while(mod>0)
         {
             s=s+" ";
             mod--;
         }
          }
       StringBuilder sb=new StringBuilder();
        if(n!=1)
        { d=spaces/(n-1);
         mod=spaces%(n-1);
        
        
        for(int i=0;i<n;i++)
        {   
          
            sb.append(str[i]);
            if(i==n-1)
                break;
            for(int j=0;j<d;j++)
            {sb.append(" ");}
            
         
        }
        while(mod>0)
        {
            sb.append(" ");
            mod--;
        }
         
         
         
         
        }
        
        if(n!=1)
         s=sb.toString();
        return s;
    }
}