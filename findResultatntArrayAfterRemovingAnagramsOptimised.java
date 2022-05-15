class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<words.length;)
        {
            int j=i+1;
            while(j<words.length && isAnagram(words[i],words[j])) j++; //skip
            l.add(words[i]);
            i=j;
            
        }
        return l;
    }
    public boolean isAnagram(String X,String Y){
      int count[]=new int[26];
        for(int i=0;i<X.length();i++){
            count[X.charAt(i)-'a']++;
        }
        
        for(int i=0;i<Y.length();i++){
            count[Y.charAt(i)-'a']--;
        }
    for(int i=0;i<count.length;i++){
        if(count[i]!=0)
            return false;
    }
    return true;
    }
}