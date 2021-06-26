class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int ans=0;
        int n1=a[n-1];
        int n2=b[m-1];
        if(n1>=n2)
        ans=n1;
        else
        ans=n2;
        int freq[]=new int[ans+1];
        int count=0;
        //freq[a[0]]++;
        for(int i=0;i<n;i++)
        {
            if(freq[a[i]]==0)
            {
                count++;
                freq[a[i]]++;
            }
        }
        for(int i:b)
        {
            if(freq[i]==0)
            {
                freq[i]++;
                count++;
            }
        }
        return count;
        
    }
}