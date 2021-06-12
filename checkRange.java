class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++)
        {
            boolean seen=false;
            for(int a[]:ranges)
            {
                int l=a[0];
                int r=a[1];
                if(i>=l && i<=r)
                    seen=true;
                
            }
            if(!seen)
                return false;
        }
        return true;
        
    }
}