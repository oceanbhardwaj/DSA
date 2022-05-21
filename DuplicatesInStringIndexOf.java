class Solution {
    String removeDups(String S) { //o(n)
            StringBuilder sb=new StringBuilder();
            sb.append(S.charAt(0));
            for(int i=1;i<S.length();i++){
               boolean flag=false;
               for(int j=0;j<i;j++){
                   if(S.charAt(i)==S.charAt(j)){
                       flag=true;
                       break;
                   }
               }
               if(!flag){
                   sb.append(S.charAt(i));
               }
            }
            return sb.toString();
    }
}



class Solution {
    String removeDups(String S) { //o(n)
        HashSet<Character> h=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(!h.contains(S.charAt(i))){
                sb.append(S.charAt(i));
                h.add(S.charAt(i));
            }
            
            
        }
        return sb.toString();
    }
}


class Solution {
    String removeDups(String S) {
       String str="";
       for(int i=0;i<S.length();i++){
           if(str.indexOf(S.charAt(i))<0)
           str+=S.charAt(i);
       }
       return str;
    }
}