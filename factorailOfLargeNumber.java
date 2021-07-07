class Solution {
    static ArrayList<Integer> factorial(int N){
       ArrayList<Integer> a=new ArrayList<>();
       long fact=1;
       for(int i=2;i<=N;i++)
       {
           fact=fact*i;
       }
       a.add((int)fact);
       return a;
    }
}
////////////////////
class Solution {
    static ArrayList<Integer> factorial(int N){
       ArrayList<Integer> a=new ArrayList<>();
       int s=recursion(N);
       a.add(s);
       return a;
    }
    public static int recursion(int n)
    {
        if(n<=1)
        {
            return 1;}
        return n*recursion(n-1);
        
    }
}
///////////////////////////////

class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> a1=new ArrayList<>();
        long a[]=new long[N+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=N;i++)
        {
            a[i]=a[i-1]*i;
        }
        a1.add((int)a[N]);
        return a1;
    }
}
//////////////////////////////////////
class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> a1=new ArrayList<>();
       java.math.BigInteger f=new java.math.BigInteger("1");
       for(int i=2;i<=N;i++)
       {
           f=f.multiply(java.math.BigInteger.valueOf(i));
       }
       int d=f.intValue();
       a1.add(d);
       return a1;
    }
}
/////////////////////////////////////////
class Solution {
  static class Node
{
    int data;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.prev=null;
    }
}
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> a1=new ArrayList<>();
      Node tail=new Node(1);
      for(int i=2;i<=N;i++)
      {
          multiply(tail,i);
      }
      print(tail,a1);
      return a1;
    }
    public static void multiply(Node tail,int n)
    {
        Node temp=tail;
        Node prevNode=null;
        int carry=0;
        while(temp!=null)
        {
            int data=temp.data*n+carry;
            temp.data=data%10;
            carry=data/10;
            prevNode=temp;
            temp=temp.prev;
        }
        while(carry!=0)
        {
            prevNode.prev=new Node(carry%10);
            carry=carry/10;
            prevNode=prevNode.prev;
        }
    }
    public static void print(Node tail,ArrayList<Integer>a)
    {
        if(tail==null)
        return;
        print(tail.prev,a);
        a.add(tail.data);
    }
}