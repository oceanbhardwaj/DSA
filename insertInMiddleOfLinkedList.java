// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
      int count=1;
      Node curr=head;
      
      while(curr!=null){
          curr=curr.next;
          count++;
      }
      int mid=(int)Math.ceil(count/2);
      curr=head;
      Node ans=curr;
      Node temp=new Node(data);
      count=1;
      Node next=null;
      if(head.next!=null)
      next=head.next;
      while(curr!=null && count<mid){
         
          curr=curr.next;
           next=curr.next;
          count++;
      }
      curr.next=temp;
     temp.next=next;
     return ans;
      
      
    }
}