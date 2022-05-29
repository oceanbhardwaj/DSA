class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
           HashMap<Character,Integer> h1=new HashMap<>();
          for(int i=0;i<target.length();i++){
            h1.put(target.charAt(i),h1.getOrDefault(target.charAt(i),0)+1);
        }
        int count=0;
        int min=Integer.MAX_VALUE;
         HashMap<Character,Integer> h2=new HashMap<>();
        boolean flag=true;
        for(char i:h1.keySet()){
           if(!h.containsKey(i))
           { flag=false;
            break;}
          
              else if(h.get(i)<h1.get(i))
              { flag=false;
                break;
            }else{
                h2.put(i,h.get(i)/h1.get(i));
                min=Math.min(h2.get(i),min);
            }
                
            
        }
        if(flag)
        {
            return min;
        }
        return 0;
    }
}