class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int sum=arr[i];
            if(sum==0)
                return true;
            for(int j=i+1;j<n;j++)
            {
                
                sum=sum+arr[j];
                if(sum==0)
                return true;
            }
        }
        return false;
    }
}
////////////////////////////////////////
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
       HashSet<Integer> h=new HashSet<>();
       int sum=0;
       for(int i=0;i<n;i++)
       {
           sum=sum+arr[i];
           if(sum==0|| h.contains(sum))
           return true;
           h.add(sum);
       }
       return false;
    }
}