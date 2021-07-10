public static boolean find3Numbers(int A[], int n, int X) { 
    Arrays.sort(A);
       for(int i=0;i<=n-3;i++)
       {
           int target=X-A[i];
           int left=i+1;
           int right=n-1;
           while(left<right)
           {
               if(A[left]+A[right]==target)
               {
                   return true;
               }
               else if(A[left]+A[right]>target)
               right--;
               else
               left++;
           }
       }
       return false;
    
    }
}
/////////////////////////////////////////////////////////
class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    Arrays.sort(A);
       for(int i=0;i<=n-3;i++)
       {
           int target=X-A[i];
           HashSet<Integer> h=new HashSet<>();
           for(int j=i+1;j<n;j++)
           {
               if(h.contains(target-A[j]))
               return true;
               h.add(A[j]);
           }
       }
       return false;
    
    }
}
