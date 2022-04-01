class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
    int ans=-1;
    int sumLeft=0;
    int sumRight=0;
    if(n==1)
    return 1;
    for(int i=0;i<n;i++)
    { sumLeft=0;
    sumRight=0;
    
        //calculating left sum
        for(int j=0;j<i;j++)
        {
            sumLeft+=arr[j];
        }
        //calculating right sum
        for(int k=i+1;k<n;k++){
            sumRight+=arr[k];
        }
        
        if(sumLeft==sumRight)
        return i+1;
    }
    return -1;
}
}
-----------------------------------------------------------------------------------------------------------
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
     long sumTotal=0;
     if(n==1)
     return 1;
     for(long i:arr)
     sumTotal+=i;
     
     long left=arr[0];
     sumTotal=sumTotal-left;
     for(int i=1;i<arr.length;i++){
         sumTotal=sumTotal-arr[i];
         if(left==sumTotal)
         return i+1;
         left=left+arr[i];
         
     }
      return -1; 
    }
}
