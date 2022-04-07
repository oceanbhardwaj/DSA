
class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
       int left=0;
       int right=n-1;
       int leftS=0;
       int rightS=0;
       for(int i=0;i<n;i++){
           if(left==right && leftS==rightS)
           return left+1;
           if(leftS<=rightS){
               leftS+=(int)arr[left];
               left++;
           }
          else if(rightS<leftS){
               rightS+=(int)arr[right];
               right--;
           }
          else 
           {
               leftS+=(int)arr[left];
               left++;
               
           }
           
       }
       return -1;
       
    }
}
