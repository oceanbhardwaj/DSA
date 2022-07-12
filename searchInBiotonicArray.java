public class Solution {
    public int solve(int[] A, int B) {
        if(A[0]==B )
        return 0;
        if(A[A.length-1]==B)
        return A.length-1;
        int peak=FindPeak(A,B);
        int ans1=BS(A,B,0,peak);
        int ans2=ReverseBS(A,B,peak+1,A.length-1);
        return Math.max(ans1,ans2);
        
    }
    public int FindPeak(int A[],int B){
        int start=0;
        int end=A.length-1;
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(mid>0 && mid<A.length-1){
                if(A[mid]>A[mid+1] && A[mid]>A[mid-1])
                return mid;
                else if(A[mid]<A[mid+1])
                start=mid+1;
                else if(A[mid]<A[mid-1])
                end=mid-1;
            }else if(mid==0){
                if(A[mid]>A[mid+1])
                return 0;
                else
                return 1;
            }else if(mid==A.length-1){
                if(A[mid]>A[mid-1])
                return mid;
                else
                return mid-1;
            }
        }
        return -1;
    }
    public int BS(int A[],int target,int start,int end){
        int ans=-1;
       
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(A[mid]==target)
            return mid;
            else if(A[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return ans;
    }
    public int ReverseBS(int A[],int target,int start,int end){
        int ans=-1;
      
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(A[mid]==target)
            return mid;
            else if(A[mid]>target)
           start=mid+1;
            else
           end=mid-1;
        }
        return ans;
    }
}
