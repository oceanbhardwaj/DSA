class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
       HashMap<Character,Character> h=new HashMap<>();
       HashSet<Character> set=new HashSet<>();
       if(str1.length()!=str2.length())
       return false;
       for(int i=0;i<str1.length();i++)
       {
           if(!h.containsKey(str1.charAt(i)))
           {  if(set.contains(str2.charAt(i)))
           return false;
               h.put(str1.charAt(i),str2.charAt(i));
               set.add(str2.charAt(i));
           }
           else 
           {
               if(h.get(str1.charAt(i))!=str2.charAt(i))
               return false;
               
           }
       }
       return true;
        
    }
}