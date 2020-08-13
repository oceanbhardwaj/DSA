class SumOfDigitsRecursion
{
	public static void main(String[] args) 
		{
			int n=253;
			//check(n);
			System.out.println(check(n));}

		
		static int check( int n)
		{
			if(n==0)
				return 0;
			return (n%10)+check(n/10);
		}
	
}