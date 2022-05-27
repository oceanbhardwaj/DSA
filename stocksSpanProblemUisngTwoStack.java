// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
       int ans[]=new int[n];
       Arrays.fill(ans,1);
       Stack<Integer> s=new Stack<>();
       Stack<Integer> dummy=new Stack<>();
       for(int i=0;i<n;i++){
           if(!s.isEmpty()){
               if(s.peek()<=price[i]){
                   while(!s.isEmpty() && s.peek()<=price[i]){
                       dummy.push(s.pop());
                   }
                   ans[i]=dummy.size()+1;
                   while(!dummy.isEmpty()){
                   s.push(dummy.pop());
               }
              
               }
               
               
               
           }
            s.push(price[i]);
       }
       return ans;
    }
    
}