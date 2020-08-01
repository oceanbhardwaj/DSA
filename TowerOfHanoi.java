import java.util.*;
class TowerOfHanoi
{  
	public static void main(String[] args) 
	{  int n=3;
		int source=1;
		int destination=3;
		int helper=2;
    

     callTower(n,source,destination,helper);

	}
	static void callTower(int n,int source,int destination,int helper)
	{

     if(n==1)
     {
     	System.out.println("from"+source+"to"+destination);
     	return;
     }
     callTower(n-1,source,helper,destination);
     System.out.println("from"+source+"to"+destination);
      callTower(n-1,helper,destination,source);



	}
}