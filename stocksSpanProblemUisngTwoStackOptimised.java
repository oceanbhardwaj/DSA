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
       //finding next greater
       int next[]=new int[n];
       Stack<Integer> s=new Stack<>();
       s.push(0);
       next[0]=-1;
       for(int i=1;i<n;i++){
           
          if(!s.isEmpty()){
              if(price[s.peek()]>price[i])
              next[i]=s.peek();
              else
              {
                  while(!s.isEmpty() && price[s.peek()]<=price[i]){
                      s.pop();
                  }
                  
                  if(s.isEmpty())
                  next[i]=-1;
                  else
                  next[i]=s.peek();
                  //s.push(i);
                  
              }
              s.push(i);
          }else{
          next[i]=-1;
          s.push(i);
          } 
       }
       int ans[]=new int[n];
       for(int i=0;i<n;i++){
           
          ans[i]=i-next[i]; 
       }
       return ans;
       
    }
    
}