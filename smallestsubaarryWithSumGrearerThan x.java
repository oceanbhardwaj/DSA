public static int sb(int arr[], int n, int x) {
       //brute force
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       { int c=arr[i];
       if(c>x)
       min=Math.min(1,min);
           for(int j=i+1;j<n;j++)
           {
               c=c+arr[j];
               if(c>x)
               {
                   min=Math.min(min,j-i+1);
               }
           }
       }
       return min;
    }
}
////////////////////////////////////////////
class Solution {

    public static int sb(int a[], int n, int x) {
        int min=Integer.MAX_VALUE;
        int left=0;
        int c=0;
        int right=0;
        while(right<n )
        {
            
           while(c<=x && right<n){
            c=c+a[right];
            right++;
          }
                
                while(c>x && left<n)
              { min=Math.min(min,right-left);
                  c=c-a[left];
                left++;}
                
            
            
         
            
        }
        return min;
    }
}


