// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        Comparator<String> co =new Comparator<String>(){
            public int compare(String s1,String s2){
                String op1=s1+s2;
                String op2=s2+s1;
            return op2.compareTo(op1);
            //return s2.compareTo(s1);
            //else
          // return s1.compareTo(s2);
            }
        };
       Arrays.sort(arr,co);
       StringBuilder sb=new StringBuilder();
       for(String s:arr){
           sb.append(s);
       }
       return sb.toString();
    }
}