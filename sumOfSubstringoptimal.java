class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i1=0;i1<t;i1++)
		{
		    String s=sc.nextLine();
		    long dp[]=new long[s.length()];
		     dp[0]=Long.parseLong(s.charAt(0)+"");
		    long res=dp[0];
		    for(int i=1;i<s.length();i++)
		    {
		        dp[i]=dp[i-1]*10+(Integer.parseInt(s.charAt(i)+""))*(i+1);
		        res=res+dp[i];
		    }
		    System.out.println(res);
		    
		}
		    
		}
	}
