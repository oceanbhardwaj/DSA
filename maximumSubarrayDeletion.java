class Solution {
    public int maximumSum(int[] arr) {
        int leftSum[]=new int[arr.length];
        int rightSum[]=new int[arr.length];
        if(arr.length==1)
            return arr[0];
        //kdanes in forward dir
       leftSum[0]=arr[0];
        int meh=leftSum[0];
        for(int i=1;i<arr.length;i++){
            meh=meh+arr[i];
            if(arr[i]>meh)
                meh=arr[i];
            
            leftSum[i]=meh;
        }
        
        //kdanes in reverse directon
     rightSum[arr.length-1]=arr[arr.length-1];
          meh= rightSum[arr.length-1];
         for(int i=arr.length-2;i>=0;i--){
            meh=meh+arr[i];
            if(arr[i]>meh)
                meh=arr[i];
            
            rightSum[i]=meh;
        }
        
        int max=0;
        max=Math.max(arr[0],rightSum[1]);
        max=Math.max(max,Math.max(arr[arr.length-1],leftSum[arr.length-2]));
        for(int i=1;i<arr.length-1;i++){
            max=Math.max(max,Math.max(leftSum[i-1],rightSum[i+1]));
            max=Math.max(max,leftSum[i-1]+rightSum[i+1]);
            max=Math.max(max,leftSum[i-1]+rightSum[i+1]+arr[i]);
        }
        return max;
    }
}