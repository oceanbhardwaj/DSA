class Solution {
    public int countLatticePoints(int[][] circles) {
        //STRING XpointsY
        HashSet<String> h=new HashSet<>();
        for(int a[]:circles){
            int x=a[0];
            int y=a[1];
            int r=a[2];
            int x_cor_start=x-r;
            int y_cor_start=y-r;
            int x_cor_end=x+r;
            int y_cor_end=y+r;
//System.out.println(x_cor_start +"-  "+x_cor_end);
                      //  System.out.println(y_cor_start +"-  "+y_cor_end);

            for(int i=x_cor_start;i<=x_cor_end;i++){
                for(int j=y_cor_start;j<=y_cor_end;j++){
                    // System.out.println(i +" abcd   "+j);
                    int xsq=Math.abs(i-x);
                    int ysq=Math.abs(j-y);
                    int sum=xsq*xsq+ysq*ysq;
                    // System.out.println("sum :"+sum);
                    if(sum<=(r*r))
                    {
                        
                        String s=i+"points"+j;
                      //  System.out.println("x :"+i+" y :"+j);
                        h.add(s);
                        
                    }
                }
            }
           
        }
         return h.size();
    }
}