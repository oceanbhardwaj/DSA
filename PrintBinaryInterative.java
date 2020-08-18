class PrintBinaryInterative
{
	public static void main(String[] args) {
		int n=5;
		for(int i=31;i>=0;i--)
		{
			if((n & (n>>i))!=0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
}