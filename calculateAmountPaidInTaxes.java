class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double amount=0.0;
        if(brackets.length==0 || income==0)
            return amount;
        if(income<brackets[0][0])
        {
            amount+=income*(double)((double)brackets[0][1]/100);
        }else{
        amount=brackets[0][0]*((double)((double)brackets[0][1])/100);
        }
       // System.out.println("A :"+amount);
        income-=brackets[0][0];
        if(income<0)
            return amount;
       // System.out.println(amount+"   jkl"+income);
        for(int i=1;i<brackets.length;i++){
            int up=brackets[i][0];
            int per=brackets[i][1];
            double e=0.0;
           // System.out.println("up :"+up +"ghjk :"+brackets[i-1][0] +" ghjkl;"+income);
            if(up-brackets[i-1][0]<=income){
                //System.out.println("inside");
              e=(up-brackets[i-1][0])*(double)((double)brackets[i][1]/100);
                  //System.out.println(e+" hjk");
            }else
            {e=(income)*(double)((double)brackets[i][1]/100);
             // System.out.println(e);
              amount=amount+e;
             break;
        }
            //System.out.println(e);
            income-=(up-brackets[i-1][0]);
            amount=amount+e;
            //System.out.println("A :"+amount);
             if(income<0)
            return amount;
        
    }
        return amount;
}
}