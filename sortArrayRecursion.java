/*package whatever //do not write package name here */

import java.io.*;


//sort an array
class GFG {
  static int arr[];
 static  int size;
	public static void main (String[] args) {
	    arr=new int[12];
	    int count=13;
	    for(int i=0;i<arr.length;i++){
	        arr[i]=count--;
	    }
		 //arr={2,3,5,2,1,5,6,2,35,5,2,9};
		 size=arr.length;
		callSort(size-1);
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	public static void callSort(int i){
	    if(i<0)
	    return;
	    int maxIndex=getMaxIndex(i);
	    //swap max with last one
	    int temp=arr[maxIndex];
	    arr[maxIndex]=arr[i];
	    arr[i]=temp;
	    callSort(i-1);
	}
	public static int getMaxIndex(int n){
	    int ans=Integer.MIN_VALUE;
	    int index=0;
	    for(int i=0;i<=n;i++){
	        if(ans<arr[i]){
	            index=i;
	            ans=arr[i];
	        }
	    }
	    return index;
	}
}