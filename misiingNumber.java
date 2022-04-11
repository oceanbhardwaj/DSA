class Solution {
    int MissingNumber(int array[], int n) {
         HashSet<Integer> h=new HashSet<>();
         for(int i=0;i<n-1;i++)
         h.add(array[i]);
         for(int i=1;i<=n;i++){
             if(!h.contains(i))
             return i;
         }
         return -1;
    }
}