// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int A[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.rotateMatrix(N, M, A);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
       int minr=0;
       int minc=0;
       int maxr=Mat.length-1;
       int maxc=Mat[0].length-1;
       int n=maxr+1;
       int m=maxc+1;
       if(n==1 || m==1)
       return Mat;
       int prev=Mat[1][0];
       //first row
       int i=0;
       int j=0;
       int total=n*m;
       int count=0;
       int curr=0;
       while(count<total){
       for( j=minc,i=minr;j<=maxc && count<total;j++){
          curr=Mat[i][j];
           Mat[i][j]=prev;
           prev=curr;
           count++;
           
       }
       minr++;
       
       //last col
       for( i=minr,j=maxc;i<=maxr  && count<total;i++){
           curr=Mat[i][j];
           Mat[i][j]=prev;
           prev=curr;
           count++;
           
       }
       maxc--;
       //last row
       for(j=maxc,i=maxr;j>=minc  && count<total;j--){
           curr=Mat[i][j];
           Mat[i][j]=prev;
           prev=curr;
           count++;
       }
       maxr--;
       
       //first col
       for( i=maxr,j=minc;i>=minr  && count<total;i--){
           curr=Mat[i][j];
           Mat[i][j]=prev;
           prev=curr;
           count++;
       }
       minc++;
       if(minr+1<=maxr )
       prev=Mat[minr+1][minc];
       else 
       break;
       if(minc+1>maxc)
       break;
       }
       return Mat;
       
    }
}