class Solution {
    int MissingNumber(int array[], int n) {
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i:array)
        sum2+=i;
        return sum-sum2;
    }
}