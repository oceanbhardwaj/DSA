class Solution{
    static int longestSubstrDistinctChars(String S){
       //o(n2)
       int max=0;
       for(int i=0;i<S.length();i++){
           boolean visited[]=new boolean[26];
           for(int j=i;j<S.length();j++){
               if(visited[S.charAt(j)-'a'])
               break;
               
               max=Math.max(max,j-i+1);
               visited[S.charAt(j)-'a']=true;
           }
       }
       return max;
        
    }
}



class Solution{
    static int longestSubstrDistinctChars(String S){
      //o(N)  /o(n) space
     int start=0;
     int max=0;
     HashMap<Character,Integer>h=new HashMap<>();
     for(int i=0;i<S.length();i++){
         if(h.containsKey(S.charAt(i))){
             start=Math.max(start,h.get(S.charAt(i))+1);
         }
         max=Math.max(i-start+1,max);
         h.put(S.charAt(i),i);
     }
      return max;  
    }
}


class Solution{
    static int longestSubstrDistinctChars(String S){
     //  o(1) 
     
     String str="";
     int max=0;
     for(int i=0;i<S.length();i++){
         if(str.indexOf(S.charAt(i))>=0){ // contain
             str=str.substring(str.indexOf(S.charAt(i))+1);
         }
         
         str+=S.charAt(i);
         max=Math.max(str.length(),max); 
         
     }
     return max;
        
    }
}