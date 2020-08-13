class reverseInt
{  static  int sum=0;
	public static void main(String[] args) {
		int n=4067;
		int sum=0;
		
System.out.println(check(n));

	}


	static int check(int n)
	{
		if(n==0)
			return sum;
		sum=sum*10+n%10;
		return check(n/10);
	}

}