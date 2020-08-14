class Permutation
{
	public static void main(String[] args) 
		{
			String s="abc";
			helper(s,0,s.length()-1);
		}

	static void helper(String s,int l,int r)
	{
      if(l==r)
      {
      	System.out.println(s);
      	return;
      }
    for(int i=l;i<=r;i++)
    {
    	s=swap(s,l,i);
    	helper(s,l+1,r);
    	s=swap(s,l,i);
    }





	}
	static String swap(String s,int l,int i)
	{ 
		char ch[]=s.toCharArray();
      char temp=ch[l];
      ch[l]=ch[i];
      ch[i]=temp;
      String g=String.valueOf(ch);
      return g;
	}
}