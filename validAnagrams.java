class Solution {
    public boolean isAnagram(String s, String t) {
        //method-1 o(nlogn) o(n) space
       /* char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);*/
        
        //methd 2- o(n) time o(n) o(26) space
        int count[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
           count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}