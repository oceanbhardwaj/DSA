class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        if(B.contains(A))
        return 1;
        //making cuts
        for(int i=1;i<A.length();i++)
        {
            String left=A.substring(0,i);
            if(B.contains(left) && wordBreak(A.substring(i),B)==1)
            return 1;
        }
        return 0;
    }
}