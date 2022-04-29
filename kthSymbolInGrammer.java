class Solution {
    public int kthGrammar(int n, int k) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"0");
        StringBuilder sb=new StringBuilder();
        for(int i=2;i<=n;i++){
          sb=new StringBuilder();
            sb.append(h.get(i-1));
            sb.append(getToggle(h.get(i-1)));
        
            h.put(i,sb.toString());
        }
        System.out.println(h);
        return h.get(n).charAt(k-1)-'0';
        
    }
    public String getToggle(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='0')
                  sb.append('1');
            else
                sb.append('0');
       
        }
         return sb.toString();
    }
    
}