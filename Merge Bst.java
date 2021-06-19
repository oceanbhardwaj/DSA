class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        ArrayList<Integer> a=new ArrayList<>();
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        //s1.push(root1);
        //s2.push(root2);
        while(!s1.isEmpty() || !s2.isEmpty() || root1!=null || root2!=null)
        {
            
                while(root1!=null)
                {s1.push(root1);
                //System.out.println(root1.data+"###");
                root1=root1.left;
                }
                while(root2!=null)
                {
                    s2.push(root2);
                     //System.out.println(root2.data+"###");
                    root2=root2.left;
                }
               
                
            
             Node n1=null;
                Node n2=null;
            if(!s1.isEmpty())
             n1=s1.peek();
            else
              n1=new Node(Integer.MAX_VALUE);
             if(!s2.isEmpty())
             n2=s2.peek();
            else
             n2=new Node(Integer.MAX_VALUE);
            if(n1.data<=n2.data)
            {
                root1=s1.pop();
                //System.out.println(root1.data+"***");
                a.add(root1.data);
                root1=root1.right;
                
                root2=null;
            }
            else if(n1.data>n2.data)
            {
                root2=s2.pop();
                //System.out.println(root2.data+"****");
                a.add(root2.data);
                root2=root2.right;
                root1=null;
            }
           // }
            
        }
        return a;
    }
}
