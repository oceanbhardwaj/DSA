class Solution {
    public String minWindow(String s, String t) {
    HashMap<Character,Integer> pat=new HashMap<>();
     HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()<t.length())
            return "";
        //hashmap of pattern
        for(int i=0;i<t.length();i++){
            pat.put(t.charAt(i),pat.getOrDefault(t.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        boolean flag1=false;
        boolean flag2=false;
        String ans="";
        int patLength=t.length();
        int matchCount=0;
        while(true){
         //acquire
            flag1=false;
            flag2=false;
         while(i<s.length() && matchCount!=patLength) {
             flag1=true;
              char ch=s.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
             //update match Count
             if(map.getOrDefault(ch,0)<=pat.getOrDefault(ch,0))
               matchCount++;  
             i++;
           }  
           //release
            while(j<s.length() && matchCount==patLength){
                 flag2=true;
                String str=s.substring(j,i);
                if(ans.length()==0 || ans.length()>str.length()){
                    ans=str;
                }
               
                //update map1
             char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)-1);
                
                //update match count
               if(map.getOrDefault(c,0)<pat.getOrDefault(c,0))
                   matchCount--;
                
                j++;
            }
        if(!flag1 && !flag2)
            break;
        
        }
        return ans;
    }
}