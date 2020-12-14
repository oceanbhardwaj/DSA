class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int d=0;
        int n=0;
        int arr[]=new int[k];
        int l=0;
        int index=0;
        for(int i=0;i<nums.length;)
        {
            d=k-1;
            n=nums.length-1-d;
           int min=Integer.MAX_VALUE;
            for(int j=i;j<=n;j++)
            {
                if(min>nums[j])
                { min=Math.min(nums[j],min);
                 index=j;
                }
            }
            i=index+1;
            arr[l++]=min;
            k--;
            if(k==0)
                break;
        }
        return arr;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}






















/*class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> s=new Stack<>();
        int count=nums.length-k;
        for(int i=0;i<nums.length;i++)
        {
           
             while(!s.isEmpty() && s.peek()>nums[i] && count>0) //try to make a monotonic increasing stack
            {
                count--;
                    s.pop();
               
            }
            
                s.push(nums[i]);
        }
        while(!s.isEmpty() && count>0)
        {s.pop();
         count--;}
        int arr[]=new int[k];
       int d=k-1;
        
        while(!s.isEmpty())
        {
           arr[d--]=s.pop();
        }
      return arr;
        
    }
}*/ 