class Solution {
    public String greatestLetter(String s) {
        ArrayList<Character> a=new ArrayList<>();
         ArrayList<Character> b=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=97 && c<=122)
                b.add(c);
            else
                a.add(c);
                
        }
        Collections.sort(a);
         Collections.sort(b);
        
      // System.out.println()
      for(int i=a.size()-1;i>=0;i--){
          for(int j=b.size()-1;j>=0;j--){
              char ch1=a.get(i);
              char ch2=b.get(j);
              if(Math.abs((int)ch2-(int)ch1)==32)
                  return (char)(Math.min(ch1,ch2))+"";
          }
      }
        return "";
    }
}