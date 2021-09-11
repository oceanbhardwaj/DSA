class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList();
        ArrayList<Integer> pre=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ArrayList<Integer>a=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    a.add(1);
                else
                {
                    a.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre=a;
            res.add(a);
        }
        return res;
        
    }
}