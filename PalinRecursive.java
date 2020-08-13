class PalinRecursive
{ 
	public static void main(String[] args) {
		
			String s ="acca";
			int left=0;
			int right=s.length()-1;
       System.out.println(check(s,left,right));
        



		}
		
		static public boolean check(String s,int left,int right)
		{  if(left==right  || left>right)
			return true;
           
           if(s.charAt(left)!=s.charAt(right))
           return false;
       return check(s,left+1,right-1);
           

		}
		
			
			






				
		
	}
