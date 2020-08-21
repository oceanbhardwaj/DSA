class EditDistANCE
{
	public static void main(String[] args) {
		String s1="saturday";
		String s2="sunday";
		int n=s1.length();
		int m=s2.length();
		System.out.println(helper(s1,s2,n,m));
	}
	static int helper(String s1,String s2,int n,int m)
	{
		if(n==0)
			return m;
		if(m==0)
			return n;
		if(s1.charAt(n-1)==s2.charAt(m-1))
			return helper(s1,s2,n-1,m-1);
		else
		{
			int d= Math.min(helper(s1,s2,n-1,m-1),helper(s1,s2,n,m-1));
			return Math.min(helper(s1,s2,n-1,m),d)+1;
		}
	}
}