/*package whatever //do not write package name here */

import java.util.*;

///revsere a stack
class GFG {
    static	Stack<Integer> s;
	public static void main (String[] args) {
    s=new Stack<>();
	s.push(1);
	s.push(2);
	s.push(3);
	call();
	while(!s.isEmpty()){
	    System.out.println(s.pop());
	}
	
	}
	public static void call(){
	    if(s.size()==0)
	    return;
	    int temp=s.pop();
	    call();
	    insert(temp);
	   
	}
	public static void insert(int ele){
	    if(s.isEmpty())
	    {
	        s.push(ele);
	        return;
	    }
	    int temp=s.pop();
	    insert(ele);
	    s.push(temp);
	}
}