class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        if(s.isEmpty())
            return 0;
        int left=0;
        int right=1;
        int count=1;
        h.put(s.charAt(0),0);
        for( right=1;right<s.length();right++ ){
             if(!h.containsKey(s.charAt(right))){
                h.put(s.charAt(right),right);
                 count=Math.max(count,right-left+1);
             }
            else{
                left=h.get(s.charAt(right))+1;
                h=new HashMap<>();
                int c=left;
                while(c<=right){
                    h.put(s.charAt(c),c);
                    c++;
                }
               
            count=Math.max(count,right-left+1);
            }
          //  right++;
        
        
        }
        return count;
    }
}