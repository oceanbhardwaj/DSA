class RopeCutting
{
	public static void main(String[] args) {
		
			int n=5;
			int a=2;
			int b=1;
			int c=5;
			//check(n,a,b,c);
			System.out.println(check(n,a,b,c));
		}
		static int check(int n,int a,int b,int c)
		{
if(n==0)
	return 0;
if(n<0)
	return -1;
int res=Math.max(check(n-a,a,b,c),check(n-b,a,b,c));
int res1=Math.max(res,check(n-c,a,b,c));
if(res1==-1)
return -1;
return res1+1;

		}
	
}