class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int l=0;
        int r=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='L')
                l++;
            else
                r++;
            if(l==r)
            {
                l=0;
                r=0;
                count++;
            }
        }
        return count;
    }
}