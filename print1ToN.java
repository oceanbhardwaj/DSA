/*package whatever //do not write package name here */

import java.io.*;
//PRINT 1 TO N USING RECUSRION
class GFG {
	public static void main (String[] args) {
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	printNumberRecursively(arr,0);
	}
	public static void printNumberRecursively(int arr[],int i){
	    if(i>=arr.length)
	    return;
	    System.out.println(arr[i]);
	    printNumberRecursively(arr,i+1);
	    
	}
}