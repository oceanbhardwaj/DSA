class GfG
{
    int maxLen(int arr[], int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        { int sum=arr[i];
        if(sum==0)
        max=Math.max(max,1);
            for(int j=i+1;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum==0 )
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}

////////////////////////////////////////////////////////
class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
       // h.put(0,1);
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        { sum=sum+arr[i];
        if(arr[i]==0)
        max=Math.max(max,1);
        if(sum==0)
        max=Math.max(max,i+1);
            if(h.containsKey(sum))
            {
                int d=h.get(sum);
                
                
                    max=Math.max(max,i-d);
                
                
            }
            else
            h.put(sum,i);
        }
        return max;
    }
}