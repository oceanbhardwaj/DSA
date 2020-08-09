class PermutationwithCaseChange
{
	public static void main(String[] args) {
		String ip="abcd";
		String op="";
		
		helper(ip,op);
	}

	static void helper(String ip,String op)
	{
		if(ip.length()==0)
		{
			System.out.println(op);
			return;
		}
		String op1=op+(ip.charAt(0)+"").toUpperCase();
		String op2=op+(ip.charAt(0)+"").toLowerCase();
		ip=ip.substring(1);
		helper(ip,op1);
		helper(ip,op2);
		
		
	}

}