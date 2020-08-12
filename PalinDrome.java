class PalinDrome
{
	public static void main(String[] args) {
		
			String s ="abc";

          System.out.println(check(s));  





		}
		static public boolean check(String s)
		{
			char c[]=s.toCharArray();
			int i=0;
			int j=s.length()-1;
			while(i<j)
			{
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				i++;
				j--;
			}
			String g=String.valueOf(c);
			if(g.equals(s))
				return true;

			return false;
		}
	}
