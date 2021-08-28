/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
	    int n=sc.nextInt();
	    int c=sc.nextInt();
	    int arr[]=new int[n];
	    for(int j=0;j<n;j++)
	    {
	        arr[j]=sc.nextInt();
	        
	    }
	    
	    Arrays.sort(arr);
	    
	    int low=arr[0];
	    //System.out.println(low);
	    int high=arr[n-1];
	    int best=0;
	    while(low<=high)
	    {
	        int mid=(low+high)/2;
	        //System.out.println("low "+low+" high "+high+" mid"+mid);
	        int countOfCows=1;
	        int left=arr[0];
	        for(int k=1;k<n;k++)
	        {
	            if(arr[k]-left>=mid)
	            {
	                countOfCows++;
	                left=arr[k];
	            }
	            if(countOfCows==c)
	            break;
	            
	        }
	        if(countOfCows==c)
	        {best=mid;
	            low=mid+1;
	        }
	        else
	        high=mid-1;
	    }
	    System.out.println(best);
	}
	}
}