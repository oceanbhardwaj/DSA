//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().sumBitDifferences(arr, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    long sumBitDifferences(int[] arr, int n) {
       long sum=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               sum+=countBits(arr[i]^arr[j]);
           }
       }
       return sum;
    }
    public int countBits(int n){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        return c;
    }
}

-------------------------------------------------------------------
//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().sumBitDifferences(arr, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    long sumBitDifferences(int[] arr, int n) {
       long sum=0;
       long set=0;
       long unset=0;
       for(int i=0;i<32;i++){
           set=0;
           unset=0;
           for(int j=0;j<n;j++){
               if((arr[j]&(1<<i))!=0) //set
               set++;
               else
               unset++;
           }
         //  System.out.println("set :"+set +"unset :"+unset);
           sum+=(set*unset*2);
       }
       return sum;
    }
}