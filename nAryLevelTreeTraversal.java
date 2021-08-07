class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> listOfLevelOrder=new ArrayList<List<Integer>>(); //return ans
        if(root==null)
            return listOfLevelOrder;
        Queue<Node> queueToStoreLevelOrder=new LinkedList<>();
        queueToStoreLevelOrder.add(root);
        //doing level order traversal
        while(!queueToStoreLevelOrder.isEmpty())
        {
            int size=queueToStoreLevelOrder.size();
            ArrayList<Integer> listOfNodes=new ArrayList<>();
           
            for(int i=0;i<size;i++)
            {
                 Node poped=queueToStoreLevelOrder.poll();
                listOfNodes.add(poped.val);
                
               
                for(Node child:poped.children)
                {
                    if(child!=null)
                       queueToStoreLevelOrder.add(child); 
                }
            }
            listOfLevelOrder.add(listOfNodes);
            
        }
        return listOfLevelOrder;
        
        
        
    }
}