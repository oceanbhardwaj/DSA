class Solution {
    public int[] countBits(int n) {
       // int count=0;
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=recursiveCountBits(i);
        }
        return arr;
    }
    public int recursiveCountBits(int n){
        if(n<=0)
            return 0;
        return ((n%2==0)?0:1) + recursiveCountBits(n/2);
    }

}
-------------------------------------------------------------------------------------------
class Solution {
     int memo[];
    public int[] countBits(int n) {
       // int count=0;
        int arr[]=new int[n+1];
         memo=new int[n+1];
        Arrays.fill(memo,-1);
        arr[0]=0;
        memo[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=recursiveCountBits(i);
            //memo[i]=arr[i];
        }
        return arr;
    }
    public int recursiveCountBits(int n){
        if(n<=0)
            return 0;
        if(memo[n]!=-1)
            return memo[n];
        memo[n]=((n%2==0)?0:1) + recursiveCountBits(n/2);
        return memo[n];
    }

}