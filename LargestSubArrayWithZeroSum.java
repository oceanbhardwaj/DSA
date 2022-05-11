// { Driver Code Starts
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
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        int max=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            if(sum==0)
            max=Math.max(1,max);
            for(int j=i+1;j<n;j++){
                sum=sum+arr[j];
                if(sum==0){
                    max=Math.max(j-i+1,max);
                }
            }
        }
        return max;
    }
}




###################################################################################################################################
// { Driver Code Starts
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
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       HashMap<Integer,Integer> h=new HashMap<>();
       h.put(0,0);
       int sum=0;
       int max=0;
       for(int i=0;i<n;i++){
           sum=sum+arr[i];
           if(sum==0)
           max=Math.max(i+1,max);
           else if(h.containsKey(sum)){
               max=Math.max(i-(h.get(sum)+1)+1,max);
           }
           if(!h.containsKey(sum))
           h.put(sum,i);
       }
       return max;
    }
}