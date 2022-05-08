class Solution {
    public String largestGoodInteger(String num) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=num.length()-3;i++){
            String sub=num.substring(i,i+3);
            if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2))
            {
             max=Math.max(Integer.parseInt(sub),max);
            }
        }
        int d=String.valueOf(max).length();
        
        if(d<3)
        {
            int num1=3-d;
            StringBuilder sb=new StringBuilder();
            while(num1>0){
                sb.append("0");
                num1--;
}
            
             return sb.append(max).toString();
        }
       
        return max==Integer.MIN_VALUE?"":max+"";
    }
}