class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]=s.split(" ");
        int i=0;
        int j=0;
        if(pattern.length()!=arr.length)
            return false;
        HashMap<Character,String> h=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        while(i<pattern.length() && j<arr.length){
           char ch=pattern.charAt(i);
            if(!h.containsKey(ch))
            { if(set.contains(arr[j]))
                return false;
                h.put(ch,arr[j]);
             set.add(arr[j]);
                i++;
             j++;
            }else{
                if(!(h.get(ch)).equalsIgnoreCase(arr[j]))
                    return false;
                i++;
                j++;
            }
        }
        return true;
    }
    
}