//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
     
     //method 1 
    //   ArrayList<Integer> a=new ArrayList<>();
    //   long res=1;
    //   for(int i=2;i<=N;i++){
    //       res=res*i;
    //   }
    //   a.add((int)res);
    //   return a ;
    
    //recursion o(n)
    //  ArrayList<Integer> a=new ArrayList<>();
    //  int d=fact(N);
    //  a.add(d);
    //  return a;
    
    //method 3
    long ans[]=new long[N+1];
    ans[0]=1;
    ans[1]=1;
    for(int i=2;i<=N;i++){
        ans[i]=ans[i-1]*i;
    }
    ArrayList<Integer> a=new ArrayList<>();
    a.add((int)ans[N]);
    return a;
    }
    public static int fact(int n){
        if(n==0 || n==1)
        return 1;
        return n*fact(n-1);
    }
}
-------------------------------------------------------------------------------------------------------
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
       ArrayList<Integer> a=new ArrayList<>();
       
       a.add(1);
       for(int i=2;i<=N;i++){
           int carry=0;
           int size=a.size();
           for(int j=0;j<size;j++){
               int res=i*a.get(j)+carry;
               int mod=res%10;
               carry=res/10;
               a.set(j,mod);
               
           }
           while(carry!=0){
               int mod=carry%10;
              carry=carry/10;
               a.add(mod);
           }
       }
       Collections.reverse(a);
       return a;
    }
}