class PalinDromeRecursive
{
	public static void main(String[] args) {
		
			String s ="aabba";

          System.out.println(check(s));  





		}
		static public boolean check(String s)
		{
			int left=0;
			int right=s.length()-1;
			while(left<right)
			{
				if(s.charAt(left)!=s.charAt(right))
                   return false;
               left++;
               right--;

			}
            

            return true;








				
		}
	}
