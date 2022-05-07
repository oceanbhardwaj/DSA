/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		//next greater to left
		int arr[]={1,4,6,7,3,5};
	//	ans=-1,-1,-1,-1,7,7
	int ans[]=new int[arr.length];
	//Arrays.fill(ans,-1);
	ans[0]=-1;
	//using stack
	Stack<Integer> s=new Stack<>();
	for(int i=0;i<arr.length;i++){
	    if(s.isEmpty()){
	        s.push(arr[i]);
	    }else if(!s.isEmpty() && s.peek()>arr[i]){
	        ans[i]=s.peek();
	        
	    }else if(!s.isEmpty() && s.peek()<=arr[i]){
	        while(!s.isEmpty() && s.peek()<=arr[i]){
	            s.pop();
	        }
	        if(s.isEmpty())
	        ans[i]=-1;
	        else
	        ans[i]=s.peek();
	    }
	    s.push(arr[i]);
	}
	
	for(int i=0;i<arr.length;i++){
	    System.out.println(ans[i]);
	}
	}
}