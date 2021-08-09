class Solution {
    public String findSubString( String str) {
       HashMap<Character,Integer> h=new HashMap<>();
       //actual string 
       for(int i=0;i<str.length();i++)
       {
           if(!h.containsKey(str.charAt(i)))
           h.put(str.charAt(i),1);
          
           
       }
       //acquire util match count matches
       int sum=h.size();
       int match=0;
       int left=0;
       String res="";
       int min=Integer.MAX_VALUE;
       HashMap<Character,Integer> h1=new HashMap<>();
       for(int i=0;i<str.length();i++)
       {
           if(h.containsKey(str.charAt(i)) && h1.containsKey(str.charAt(i)) && h.get(str.charAt(i))>h1.get(str.charAt(i)))
           match++;
           else if(!h1.containsKey(str.charAt(i)) && h.containsKey(str.charAt(i)))
           match++;
           h1.put(str.charAt(i),h1.getOrDefault(str.charAt(i),0)+1);
           if(match==sum)
           {
               if(min>i-left+1)
               {
                   min=i-left+1;
                   res=str.substring(left,i+1);
                   //System.out.println(res);
               }
               while(match==sum)
               {
                   //System.out.println("gghj");
                   h1.put(str.charAt(left),h1.get(str.charAt(left))-1);
                   if(h.containsKey(str.charAt(i)) && h1.containsKey(str.charAt(i)) && h1.get(str.charAt(left))<h.get(str.charAt(left)))
                   {
                       //System.out.println("xxxxgghj");
                       match--;
                       left++;
                       break;
                   }
                   left++;
                   if(min>i-left+1)
               {
                   //System.out.println("ggfghhj");
                   min=i-left+1;
                   res=str.substring(left,i+1);
                   //System.out.println(res);
               }
               }
           }
       }
       return res;
    
    }
}