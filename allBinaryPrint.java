class allBinaryPrint
{
	public static void main(String[] args) {
		String op="";
		int n=4;
		helper(op,n);
	}
	static void helper(String op,int n)
	{
		if(n==0)
		{
			System.out.println(op);
			return;
		}
		String op1=op+"0";
        String op2=op+"1";
        helper(op1,n-1);
        helper(op2,n-1);
	}
}