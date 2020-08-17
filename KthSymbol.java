class Solution {
    public int kthGrammar(int N, int K) {
        if(N==1 && K==1)
            return 0;
        int mid=(1<<N-1)/2;
        if(K<=mid)
            return kthGrammar(N-1,K);
        else
            return reverse(kthGrammar(N-1,K-mid));
        
    }
    static int reverse(int n)
    {
        if(n==0)
            return 1;
        else
            return 0;
    }
}