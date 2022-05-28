class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer>h=new HashMap<>();
        for(int i=0;i<messages.length;i++){
            String msg[]=messages[i].split(" ");
            String sen=senders[i];
            if(h.containsKey(sen)){
                h.put(sen,h.get(sen)+msg.length);
            }else
                h.put(sen,msg.length);
            
        }
        System.out.println(h);
        int len=0;
        String ans="";
        for(String s:h.keySet()){
            if(len<h.get(s)){
                len=h.get(s);
                ans=s;
            }else if(len==h.get(s)){
                if(ans.compareTo(s)<0)
                    ans=s;
                
            }
        }
        return ans;
    }
}