class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> h=new HashMap<>();
        int count=0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' ')
                continue;
            if(!h.containsKey(key.charAt(i))){
                h.put(key.charAt(i),(char)(count+97));
                count++;
            }
           
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' ')
            {
                sb.append(" ");
                continue;
            }
            sb.append(h.get(message.charAt(i)));
            
            
        }
        return sb.toString();
    }
}