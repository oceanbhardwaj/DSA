class Solution {
    public boolean makeEqual(String[] words) {
        // if(words.length<=1)
        //     return true;
        HashMap<Character,Integer> h=new HashMap<>();
        for(String s:words)
        {
            for(char c:s.toCharArray())
            {
                h.put(c,h.getOrDefault(c,0)+1);
            }
        }
        int r=0;
        for(char c:h.keySet())
        {
            r=h.get(c);
            break;
        }
        int n=words.length;
         for(char c:h.keySet())
        {
            if(h.get(c)%n!=0)
                return false;
        }
       //  String str=words[0];
       // if(str.length()==1)
       // {
       //     for(String s:words)
       //     {
       //         if(!s.equals(str))
       //             return false;
       //     }
       // }
        return true;
        
    }
}