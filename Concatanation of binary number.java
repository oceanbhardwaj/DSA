/*import java.math.*;
class Solution {
    public int concatenatedBinary(int n) {
        String res="";
        int m=(int)(1e9+7);
        for(int i=1;i<=n;i++)
        {
            String s=Integer.toBinaryString(i);
            res=res+s;
        }
        BigInteger d=new BigInteger(res,2);
         BigInteger d1=new BigInteger(String.valueOf(m));
       BigInteger f=d.mod(d1);
      int d11=f.intValue();
        return d11;
    }
}*/


class Solution {
    public int concatenatedBinary(int n) {
       long res=1;
        int mod=(int)(1e9+7);
        for(int i=2;i<=n;i++)
        { long l=(long)(Math.log(i)/Math.log(2));
            long d=l+1;
         res=(res*(long)Math.pow(2,d)+i)%mod;
         
            
        }
        
        return (int)res%mod;
        
        
        
    }
}