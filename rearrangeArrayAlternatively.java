class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        long max=arr[n-1]+1;
        int mini=0;
        int maxi=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0)//even
            {
                arr[i]=(arr[i]+(arr[maxi--]%max)*max);
            }else{
                arr[i]=arr[i]+(arr[mini++]%max)*max;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/max;
        }
        
        
    }
    
}


