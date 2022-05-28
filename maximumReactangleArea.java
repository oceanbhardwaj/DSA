class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=0;
        int ans[]=new int[m];
       for(int i=0;i<m;i++){
           ans[i]=matrix[0][i]-'0';
           
       }
        max=Math.max(max,MAH(ans));
      for(int i=1;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]=='0')
                ans[j]=0;
            else
                ans[j]+=matrix[i][j]-'0';
        }
          max=Math.max(MAH(ans),max);
      }
        return max;
    }
    public int MAH(int ans[]){
        
          Stack<Integer> s=new Stack<>();
        int max=0;
        for(int i=0;i<ans.length;i++){
            while(!s.isEmpty() && ans[s.peek()]>=ans[i])
            {
                int ele=s.pop();
                max=Math.max(max,(ans[ele]*(s.isEmpty()?i:i-s.peek()-1)));
                
            }
            s.push(i);
        }
      int m=ans.length;
        while(!s.isEmpty()){
            int ele=s.pop();
            max=Math.max(max,(ans[ele]*(s.isEmpty()?m:(m-s.peek()-1))));
        }
        return max;
    }
}