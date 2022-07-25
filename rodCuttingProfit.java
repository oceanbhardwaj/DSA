 return (int)helper(n,cuts,0);
    }
    public long helper(int amount,int cuts[],int index){
        if(index>=cuts.length && amount>0)
            return Integer.MAX_VALUE;
        if(amount==0)
            return 0;
      
            
        if(cuts[index]<=amount)
            return Math.min(amount+helper(amount-cuts[index],cuts,index+1),helper(amount,cuts,index+1));
        else
            return helper(amount,cuts,index+1);
    }
	