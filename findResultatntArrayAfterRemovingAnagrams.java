class Solution {
    public List<String> removeAnagrams(String[] words) {
       // List<String> ans=new ArrayList<>();
        List<String> l=new ArrayList<>();
       
        for(String s:words)
            l.add(s);
            int i=0;
        while(i+1<l.size()){
         char ch[]=l.get(i).toCharArray();
            Arrays.sort(ch);
            String str1=new String(ch);
            
            char ch1[]=l.get(i+1).toCharArray();
            Arrays.sort(ch1);
            String str2=new String(ch1);
           if(str1.equals(str2))
           { l.remove(i+1);
            
           }else
               i++;
            
        }
            return l;
        }
    
}