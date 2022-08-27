long maxSubarraySum(int arr[], int n){
        
       long sum=0;
       long max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           sum=arr[i];
           max=Math.max(max,sum);
           for(int j=i+1;j<n;j++){
               sum+=arr[j];
               max=Math.max(max,sum);
           }
       }
       return max;
        
--------------------------------------------------------------
//{ Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        int meh=arr[0];
        int msf=arr[0];
        for(int i=1;i<n;i++){
            meh=meh+arr[i];
            if(meh<arr[i])
            {
                meh=arr[i];
            }
            msf=Math.max(msf,meh);
        }
        return msf;
    }
    
}

