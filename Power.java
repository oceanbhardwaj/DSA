class Power
{  static int temp=0;
	static int d=0;
	public static void main(String[] args) {
		int n=2;
		int x=4;
		
		System.out.println(powerofnumber(2,4));
	}
	static int powerofnumber(int n,int x)
	{ 
		if(n==0)
			return 0;
		if(x==0)
			return 1;
		if(x==1)
			return n;
		if(n==1)
			return 1;
        if(x%2==0)
		 temp= powerofnumber(n,x/2)*powerofnumber(n,x/2);
		 else
		 temp= n*powerofnumber(n,(x-1)/2)*powerofnumber(n,(x-1)/2);

		 	return temp;
		 
	

	}
}