class solve{
    // return an array of size 2 having the 0th element equal to the count
    // and 1st element equal to the maximum profit
    int[] JobScheduling(Job arr[], int n){
       
        Comparator<Job> co=new Comparator<Job>(){
          public int compare(Job j1,Job j2)
          {
              return j2.profit-j1.profit;
          }
            
            
        };
        Arrays.sort(arr,co);
        int ans[]=new int[2];
        boolean slot[]=new boolean[n];
        int result[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=Math.min(n,arr[i].deadline)-1;j>=0;j--)
            {
                if(slot[j]==false)
                {  result[j]=i;
                    slot[j]=true;
                    break;
                }
            }
        }
        int count=0;
        int profit=0;
        for(int i=0;i<n;i++)
        {
            if(slot[i]==true)
            {
                count++;
                profit=profit+arr[result[i]].profit;
            }
        }
        
       ans[0]=count;
       ans[1]=profit;
       return ans;
        
        
        
        
        
        
        
    }
}