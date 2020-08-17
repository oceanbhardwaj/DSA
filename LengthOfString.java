class LengthOfString
{
	public static void main(String[] args) {
		String s="abcdd";
		int n=s.length();
		
			//
		System.out.println(Helper(s));
		
	}
	static int Helper(String s)
	{
		if(s.equals(""))
			return 0;
		return Helper(s.substring(1))+1;


	}
}