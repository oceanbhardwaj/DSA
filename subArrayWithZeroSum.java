//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        int max=0;
        for(int i=0;i<n;i++){
            long sum=arr[i];
            if(sum==0)
            max=Math.max(max,1);
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    max=Math.max(j-i+1,max);
                }
            }
        }
        return max;
    }
}
----------------------------------------
//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
      int sum=0;
     
      HashMap<Integer,Integer> h=new HashMap<>();
      
      int max=0;
      for(int i=0;i<n;i++){
          sum+=arr[i];
          if(sum==0){
              max=Math.max(max,i+1);
          }
          if(h.containsKey(sum)){
              max=Math.max(i-h.get(sum),max);
          }else
          {
              h.put(sum,i);
          }
      }
      return max;
    }
}