class Solution {
    public int kthGrammar(int n, int k) {
       return recursionKthGrammer(n,k);
    }
    public int recursionKthGrammer(int n,int k){
         if(n==1 && k==1)
            return 0;
        int mid=(1<<(n-1))/2;
        if(k<=mid){
            return recursionKthGrammer(n-1,k);      
        }
        else
            return reverse(recursionKthGrammer(n-1,k-mid));
    }
    public int reverse(int n){
        return n^1;
    }
}