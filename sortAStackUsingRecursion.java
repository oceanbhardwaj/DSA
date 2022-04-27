/*package whatever //do not write package name here */

import java.util.*;
//sort a stack
class GFG {
    static 	Stack<Integer>s;
	public static void main (String[] args) {
s=new Stack<>();
	s.push(10);
	s.push(31);
	s.push(4);
	call(s);
	while(!s.isEmpty()){
	    System.out.println(s.peek());
	    s.pop();
	}
	
	}
	public static void call(Stack<Integer> s){
	    if(s.isEmpty())
	    return;
	    
	    int temp=s.pop();
	    call(s);
	    insertAtCorrect(s,temp);
	}
	public static void insertAtCorrect(Stack<Integer> s,int temp){
	    if(s.isEmpty() || s.peek()<temp)
	    {
	        s.push(temp);
	        return;
	    }
	    int popped=s.pop();
	    insertAtCorrect(s,temp);
	    s.push(popped);
	}
	
}