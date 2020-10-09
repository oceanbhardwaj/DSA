class solve{
    double fractionalKnapsack(int W, Item arr[], int n) {
        Comparator<Item> co =new Comparator<Item>(){
            public int compare(Item a,Item b)
            {
                double r2=(double)b.value/(double)b.weight;
                double r1=(double)a.value/(double)a.weight;
                if(r1>r2)
                return -1;
                else if(r2>r1)
                return 1;
                return 0;
            }
        };
        Arrays.sort(arr,co);
        int ww=0;
        double x[]=new double[n];
        
        for(int i=0;i<n;i++)
        {
            if(ww+arr[i].weight<=W)
            {
                x[i]=1;
                
                ww=ww+arr[i].weight;
            }
            else
            {
                x[i]=(double)((double)(W-ww)/(double)arr[i].weight);
                break;
            }
        }
        double profit=0.0;
        for(int i=0;i<n;i++)
        {
            profit=profit+x[i]*arr[i].value;
        }
            
         return profit;   
            
            
            
        
        
    }
}