class Solution {
    public String removeOccurrences(String s, String part) {
        int p=part.length();
        while(s.contains(part))
        {
            for(int i=0;i<=s.length()-p;i++)
            {
                String str=s.substring(i,i+p);
                if(str.equals(part))
                {
                    s=s.substring(0,i)+s.substring(i+p);
                    break;
                }
            }
        }
        return s;
    }
}