/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		 int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int key = 10;
      
        //iterative
        int start=0;
        int end=n-1;
        Random r=new Random();
        while(start<=end){
            int mid=r.nextInt(end-start+1)+start;
            //int mid=(start + (int)(Math.random() % (end-start+1)));
             System.out.println("key :"+mid);
            if(arr[mid]==key)
            {System.out.println("key found at :"+mid);
            break;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
	}
}