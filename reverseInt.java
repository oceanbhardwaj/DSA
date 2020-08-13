class reverseInt
{
	public static void main(String[] args) {
		int n=4522;
		int d=n;
		int count=0;
		while(d>0)
		{
			count++;
			d=d/10;
		}
		int base=(int)Math.pow(10,count-1);
		int sum=0;
		while(n>0)
		{
			d=n%10;
			sum=sum+base*d;
			base=base/10;
			n=n/10;
		}
		System.out.println(sum);

	}

}