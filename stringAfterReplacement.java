class Solution {
    public boolean matchReplacement(String s, String sub, char[][] mappings) {
        //BRUTEFORCE
        HashMap<Character,HashSet<Character>> h=new HashMap<>();
        for(char a[]:mappings){
            h.putIfAbsent(a[0],new HashSet<Character>());
            h.get(a[0]).add(a[1]);
        }
       boolean flag=true;
        for(int i=0;i<s.length()-sub.length()+1;i++)//for string s
        {
            flag=true;
           for(int j=0;j<sub.length();j++){
              if(s.charAt(i+j)==sub.charAt(j))
                  continue;
               else if(h.containsKey(sub.charAt(j))){
                   if(!h.get(sub.charAt(j)).contains(s.charAt(i+j))){
                       flag=false;
                       break;
                   }
               }else{
                   flag=false;
                   break;
               }
               
           } 
            if(flag)
                return true;
            
            
        }
        return false;
    }
}