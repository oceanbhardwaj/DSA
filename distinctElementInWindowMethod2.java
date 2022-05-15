// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
       ArrayList<Integer> a=new ArrayList<>();
        
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<k;i++){
            h.put(A[i],h.getOrDefault(A[i],0)+1);
        }
        int count=0;
       count=h.size();
        a.add(count);
        for(int i=k;i<n;i++){
            int ele=A[i-k];
            
            h.put(ele,h.get(ele)-1);
            if(h.get(ele)==0)
            count--;
           
            if(!h.containsKey(A[i])){
               h.put(A[i],1);
               count++;
            }else{
                h.put(A[i],h.getOrDefault(A[i],0)+1);
                if(h.get(A[i])==1)
                count++;
            }
            a.add(count);
        }
        return a;
    }
}

