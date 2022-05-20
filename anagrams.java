class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        //sorting o(nlogn)
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1,ch2);
        
        
    }
}



class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        //count array o(n) 
        int count[]=new int[26];
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)-'a']++;
        }
        
         for(int i=0;i<b.length();i++){
            count[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0)
            return false;
        }
        return true;
        
    }
}