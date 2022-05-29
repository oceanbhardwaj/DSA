class Solution {
    public String discountPrices(String sentence, int discount) {
        StringBuffer sb=new StringBuffer();
     String arr[]=sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
           // boolean flag=true;
            if(s.startsWith("$")){
                if(s.length()==1)
                {
                    sb.append("$");
                    if(i!=arr.length-1)
                    sb.append(" ");
                    continue;
                }
              boolean flag=true;
                //checking in whole string
                for(int j=1;j<s.length();j++){
                    if(!Character.isDigit(s.charAt(j)))
                        flag=false;
                }
                System.out.println("s :"+s +"falg :"+flag);
                if(!flag)
                    sb.append(s);
                else
                {
                    
                    //getting string 
                    String str=s.substring(1);
                    //int r=0;
                    long num=0;
                    int i1=1;
                    while(i1<s.length()){
                        num*=10;
                        num+=s.charAt(i1++)-'0';
                    }
                   // int d=Integer.parseInt(s.substring(1));
                   long d=num;
                    System.out.println(d);
                double d1=(double)(d*discount)/100;
                double d2=Double.parseDouble(String.valueOf(d));
                String e=String.format("%.2f",d2-d1);
                sb.append("$").append(e);
                
                }
               
        
    }else
                sb.append(s);
             if(i!=arr.length-1)
                    sb.append(" ");
        }
        return sb.toString();
}}