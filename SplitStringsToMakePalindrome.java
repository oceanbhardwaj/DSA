/*class Solution {    //tle
    public boolean checkPalindromeFormation(String a, String b) {
    if(Palindrome(a) || Palindrome(b))
    return true;
        return (check(a,b) || check(b,a));
        
    }
    private boolean Palindrome(String s1)
    {
        if(s1.length()<=1)
            return true;
        int start=0;
        int end=s1.length()-1;
        while(start<=end)
        {
            if(s1.charAt(start)!=s1.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    
    private boolean check(String a,String b)
    {
        
        char ch[]=b.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            ch[i]=a.charAt(i);
            String s11=new String(ch);
            if(Palindrome(s11))
                return true;
        }
        
       return false; 
        
        
    }
    
  }*/



// second method
class Solution {    
    public boolean checkPalindromeFormation(String a, String b) {
   
        return (check(a,b) || check(b,a));
        
    }
    private boolean Palindrome(String s1 ,int start,int end)
    {
        if(s1.length()<=1)
            return true;
        
        while(start<end)
        {
            if(s1.charAt(start)!=s1.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    
    private boolean check(String a,String b)
    {
       for(int i=0, j=a.length()-1;i<j;i++,j--)
       {
           if(a.charAt(i)!=b.charAt(j))
           {
               return Palindrome(a,i,j)||Palindrome(b,i,j);
               
           }
           
       }
    
    
    return true;
    
    
    
    }
}
    
    
