lass Solution {
    void segregate0and1(int[] arr, int n) {
       //method1
       int count=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0)
           count++;
       }
       int i=0;
       for(i=0;i<count;i++)
       {
          arr[i]=0; 
       }
       for(;i<n;i++){
           arr[i]=1;
       }
    }

}
-----------------------------------------------------------------------------
class Solution {
    void segregate0and1(int[] arr, int n) {
       //method1
       int index=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0)
           arr[index++]=arr[i];
       }
       for(int i=index;i<n;i++){
           arr[i]=1;
       }

}
}
---------------------------------------------------------------------------
class Solution {
    void segregate0and1(int[] arr, int n) {
       //method1
       int index=0;
       for(int i=0;i<n;i++){
           if(arr[i]==0)
          {
              //swap
             // i and index
              int temp=arr[i];
              arr[i]=arr[index];
              arr[index]=temp;
              index++;
          }
       }
      

}
}