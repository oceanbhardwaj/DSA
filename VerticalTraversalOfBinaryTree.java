/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
     TreeNode node;
        int x;
        int y;
        Pair(TreeNode node,int x,int y){
            this.node=node;
            this.x=x;
            this.y=y;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
       Comparator co=new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                if(p1.y==p2.y)
                    return p1.node.val-p2.node.val; //sort on basis of node values if on same level
                return p1.y-p2.y;//level wise
            }
};
        Map<Integer,PriorityQueue<Pair>> h=new TreeMap();
         
        Queue<Pair> pq=new LinkedList<>();
        pq.add(new Pair(root,0,0));
        while(!pq.isEmpty()){
            Pair popped=pq.poll();
            TreeNode poppedNode=popped.node;
            int X=popped.x;
            int Y=popped.y;
            h.putIfAbsent(X,new PriorityQueue<Pair>(co));
            h.get(X).add(popped);
            if(poppedNode.left!=null){
                pq.add(new Pair(poppedNode.left,X-1,Y+1));
            }
            if(poppedNode.right!=null){
                pq.add(new Pair(poppedNode.right,X+1,Y+1));
            }
            
        }
        
        for(int p:h.keySet()){
            PriorityQueue<Pair> queue=h.get(p);
            ArrayList<Integer> a=new ArrayList<>();
            while(!queue.isEmpty()){
                a.add(queue.poll().node.val);
            }
            res.add(a);
        }
        
        return res;
    }
}