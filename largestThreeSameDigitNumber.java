class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        int max=Integer.MIN_VALUE;
        for(int i=2;i<num.length();i++){
        if(num.charAt(i-2)==num.charAt(i-1) && num.charAt(i-1)==num.charAt(i))
        {
            String s1=num.substring(i-2,i+1);
            if(s1.compareTo(s)>0)
                s=s1;
        }
       
        }
        return s; 
    }
}