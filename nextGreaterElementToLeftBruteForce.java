/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//next greater to left
		int arr[]={1,4,6,7,3,5};
	//	ans=-1,-1,-1,-1,7,7
	int ans[]=new int[arr.length];
	Arrays.fill(ans,-1);
	for(int i=0;i<arr.length;i++)
	{
	    for(int j=i-1;j>=0;j--){
	        if(arr[j]>arr[i])
	        {
	            ans[i]=arr[j];
	            break;
	        }
	    }
	}
	for(int i=0;i<arr.length;i++){
	    System.out.println(ans[i]);
	}
	}
}