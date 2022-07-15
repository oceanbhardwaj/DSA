// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
       ArrayList<ArrayList<Integer>> a=new ArrayList<>();
       call(arr,0,sum,a,new ArrayList<Integer>());
       int s=0;
       for(ArrayList<Integer> list:a){
           s=0;
           for(int i:list){
               s+=i;
           }
           if(s==sum)
           return true;
       }
       return false;
    }
    public static void call(int arr[],int start,int sum, ArrayList<ArrayList<Integer>> a,ArrayList<Integer> aa){
        if(start>=arr.length)
        {
            if(!aa.isEmpty())
            a.add(aa);
            return;
        }
        call(arr,start+1,sum,a,new ArrayList<Integer>(aa));
        aa.add(arr[start]);
        call(arr,start+1,sum,a,new ArrayList<Integer>(aa));
        
    }
}
--------------------------------------------------------------------------------------------------------------
// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
      if(sum==0)
      return true;
      if(N==0)
      return false;
      if(arr[N-1]<=sum){
          //take or not take
          return isSubsetSum(N-1,arr,sum-arr[N-1]) || isSubsetSum(N-1,arr,sum);
      }else
      return isSubsetSum(N-1,arr,sum);
    }
}
------------------------------------------------------------------------------
// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{

    
    static Boolean isSubsetSum(int N, int arr[], int sum){
        int dp[][]=new int[N][sum+1];
        for(int i=0;i<N;i++){
            Arrays.fill(dp[i],-1);
        }
        return call(N,arr,sum,dp);
      }
      
      public static boolean call(int N,int arr[],int sum,int dp[][]){
      if(sum==0)
      return true;
      if(N==0)
      return false;
      if(dp[N-1][sum]!=-1)
      return dp[N-1][sum]==0?false:true;
      if(arr[N-1]<=sum){
          //take or not take
          boolean f= call(N-1,arr,sum-arr[N-1],dp) || call(N-1,arr,sum,dp);
       dp[N-1][sum]=(f==true)?1:0;
       return f;
      }else{
      boolean f1= call(N-1,arr,sum,dp);
      dp[N-1][sum]=(f1==true)?1:0;
      return f1;
    
      }
}
}
---------------------------------------------------------------------------------------
// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
       boolean dp[][]=new boolean[N+1][sum+1];
       for(int i=0;i<N;i++){
           for(int j=0;j<sum+1;j++){
               if(i==0)
               dp[i][j]=false;
               if(j==0)
               dp[i][j]=true;
           }
       }
       for(int i=1;i<=N;i++){
           for(int j=1;j<sum+1;j++){
              if(arr[i-1]<=j)
              dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
              else
              dp[i][j]=dp[i-1][j];
           }
       }
       return dp[N][sum];
    }
}