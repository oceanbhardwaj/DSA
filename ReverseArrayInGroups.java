

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
      
      for(int i=0;i<n;i+=k){
         
          int start=i;
          int end=Math.min(i+(k-1),n-1);
          
          while(start<=end)
          {
              swap(start,end,arr);
              start++;
              end--;
          }
          
      }
    }
    public  void swap(int a,int b,ArrayList<Integer> arr){
        int temp=arr.get(b);
        arr.set(b,arr.get(a));
        arr.set(a,temp);
       
    }
}
