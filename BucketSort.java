
import java.util.*;
import java.util.stream.Collectors; 

class Stream11
{
	public static void main(String[] args) {
		int arr[]={ .8, .5, .6, .10, .0, .3 ,.2,.9,.7,.4} ;
		int n=arr.length;
		ArrayList<Integer> a[]= new ArrayList[n+1];
		for(int i=0;i<=n;i++)
		{
			a[i]=new ArrayList<>();
		}
		for(int i=0;i<n;i++)
		{
			int d=(int)((n)*(arr[i]));
			a[d].add(arr[i]);
		}
		for(int i=1;i<=n;i++)
		{
			Collections.sort(a[i]);
		}
		int index=0;
		for(int i=1;i<=n;i++)
		{
          ArrayList<Integer> adj=a[i];
          for(int j:adj)
          {
            arr[index++]=j;
          }
		}

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}