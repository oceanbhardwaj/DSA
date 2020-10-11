class Solution
{
    // Function to return Largest Number
    static String largestNumber(int n, int sum)
    {  if(n==0 || sum==0)
    return "0";
    if(sum>9*n)
    return "-1";
       StringBuffer sb=new StringBuffer();
       int count=0;
       while(sum>0){
       if(sum>=9)
       {sb.append("9");
       count++;
       sum=sum-9;}
       else
       {
           sb.append(sum);
           count++;
           
           break;
       }}
       while(count!=n)
      { sb.append("0");
      count++;}
      String g1=sb.toString();
      return g1;
       
       
    }
}

