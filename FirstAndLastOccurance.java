class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> res=new ArrayList<>();
        if(arr.length==0)
        return res;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                res.add((long)i);
                break;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                res.add((long)i);
                break;
            }
        }
        if(res.isEmpty())
        {
            res.add((long)-1);
            res.add((long)-1);
        }
        return res;
    }
}
/////////////////////////////////////////
class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> res=new ArrayList<>();
        int id1=-1;
        int id2=-1;
         id1=BinarySearchforFirstIndex(arr,n,x);
         id2=BinarySearchForLastIndex(arr,n,x);
         res.add((long)id1);
         res.add((long)id2);
         return res;
    }
    public int BinarySearchForLastIndex(long arr[],int n,int x)
    {
        int ans=-1;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==x)
            {
                ans=mid;
                left=mid+1;
            }
            else if(arr[mid]<x)
             left=mid+1;
            else
            right=mid-1;
        }
        return ans;
        
    }
    public int BinarySearchforFirstIndex(long arr[],int n,int x)
    {
        int ans=-1;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]<x)
            {
                
                left=mid+1;
            }
            else     if(arr[mid]==x)
            {
            ans=mid;
            right=mid-1;
                }
                else{
            right=mid-1;
            
            }
        }
        return ans;
        
    }
}
