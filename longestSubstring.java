class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        int max=0;
        int start=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!h.containsKey(ch))
            {
               h.put(ch,i); 
                max=Math.max(i-start+1,max);
                //System.out.println("i :"+i +" max :"+max +"start :"+start);
            }else{
                start=Math.max(start,h.get(ch)+1);
                h.put(ch,i);
                max=Math.max(i-start+1,max);
                // System.out.println("i :"+i +" max :"+max+"start :"+start);
            }
        }
        return max;
    }
}