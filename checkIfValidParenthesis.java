class Solution {
    public boolean hasValidPath(char[][] grid) {
        ArrayList<String> res=new ArrayList<>();
        int n=grid.length; //rows
        int m=grid[0].length; //column
        boolean visited[][]=new boolean[n][m];
        // System.out.println("n :"+n +"m :"+m);
        call(grid,res,0,0,n,m,"");
       
        //System.out.println(res);
        //check for valid
        for(String s:res){
        if(isValid(s))
            return true;
        
        
        }
        return false;
        
    }
    public void call(char grid[][],ArrayList<String> res,int i,int j,int n,int m,String output){
       // System.out.println("i :"+i+ "j :"+j);
          // System.out.println("i :"+i+ "n :"+n);
        if(i>=n || j>=m || i<0 || j<0)
        {
         //  System.out.println(output);
           // System.out.println("row :"+(n-1)+"col :"+(m-1));
          if(output.length()==(m+n-1))
             res.add(output);
        return;
        
        }
        output+=grid[i][j];
        call(grid,res,i+1,j,n,m,output);
        call(grid,res,i,j+1,n,m,output);
        
    }
    
    
    public boolean isValid(String s){
Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
         
            if(!s1.isEmpty() && s1.peek()=='(' && s.charAt(i)==')')
            {
             s1.pop();
            
            }
            else 
                s1.push('(');
        }
        return s1.isEmpty()?true:false;
    
    }
}