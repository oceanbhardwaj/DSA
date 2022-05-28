class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<num.length();i++){
            h.put(num.charAt(i)-'0',h.getOrDefault(num.charAt(i)-'0',0)+1);
        }
        for(int i=0;i<num.length();i++){
            System.out.println(i);
            if(!h.containsKey(i) && num.charAt(i)!='0')
                return false;
          else if(h.containsKey(i) && num.charAt(i)-'0'!=h.get(i))
               return false;
             System.out.println("cfgvhbjn");
        }
        return true;
    }
}