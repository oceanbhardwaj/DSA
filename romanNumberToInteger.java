class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
      HashMap<Character,Integer> h=new HashMap<>();
      h.put('I',1);
      h.put('V',5);
      h.put('X',10);
      h.put('L',50);
      h.put('C',100);
      h.put('D',500);
      h.put('M',1000);
      int res=h.get(str.charAt(str.length()-1));
      for(int i=str.length()-2;i>=0;i--)
      {
          if(h.get(str.charAt(i))>=h.get(str.charAt(i+1)))
          res=res+h.get(str.charAt(i));
          else
          res=res-h.get(str.charAt(i));
      }
      return res;
    }
}