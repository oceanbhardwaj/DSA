class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int n=s.length();
        int sum=h.get(s.charAt(n-1));
        for(int i=n-2;i>=0;i--){
         char c=s.charAt(i);
            char cplus1=s.charAt(i+1);
            if(h.get(c)<h.get(cplus1)){
                sum-=h.get(c);
            }else
                sum+=h.get(c);
        
        
        }
        return sum;
        
    }
}