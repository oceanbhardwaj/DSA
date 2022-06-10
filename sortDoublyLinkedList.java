// { Driver Code Starts
import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        if(head==null || head.next==null)
        return head;
        
        //find mid
        Node slow=head;
        Node fast=head;
        Node ans=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        Node left=sortDoubly(ans);
        Node right=sortDoubly(slow);
        return merge(left,right);
        
    }
    public static Node merge(Node left,Node right){
        if(left==null)
        return right;
        if(right==null)
        return left;
         Node n=new Node(1);
        Node ans=n;
        if(left.data<right.data){
            n.data=left.data;
            left=left.next;
        }else{
            n.data=right.data;
            right=right.next;
        }
       
        Node prev=null;
        n.prev=null;
        while(left!=null || right!=null){
            while(left!=null && right!=null){
                if(left.data<right.data){
                    prev=n;
                  n.next=left;
                    n=n.next;
                  n.prev=prev;
                  left=left.next;
                }else{
                    prev=n;
                    n.next=right;
                      n=n.next;
                    n.prev=prev;
                    right=right.next;
                }
              
                }
                if(left!=null){
                    prev=n;
                    n.next=left;
                    n=n.next;
                    n.prev=prev;
                    left=null;
                    
                    
                }
                if(right!=null){
                    prev=n;
                    n.next=right;
                    n=n.next;
                    n.prev=prev;
                    right=null;
                }
        }
        return ans;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}