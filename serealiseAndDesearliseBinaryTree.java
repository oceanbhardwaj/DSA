/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "#";
        StringBuffer sb=new StringBuffer();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
              int size=q.size();
            for(int i=0;i<size;i++){
            TreeNode popped=q.poll();
                
                if(popped==null)
                    sb.append("#");
                else
            sb.append(popped.val);
                sb.append(",");
          
            if(popped!=null ){
                q.add(popped.left);
                 q.add(popped.right);
            }
           
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        return sb.toString();
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       String arr[]=data.split(",");
        if(arr[0].equals("#"))
            return null;
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode ans=root;
        q.add(root);
        TreeNode popped=null;
        for(int i=1;i<=arr.length-2;){
            
            if(!q.isEmpty())
                 popped=q.poll();
            if(popped!=null){
            popped.left=(!arr[i].equals("#"))?new TreeNode(Integer.parseInt(arr[i])):null;
            popped.right=(!arr[i+1].equals("#"))?new TreeNode(Integer.parseInt(arr[i+1])):null;
             q.add(popped.left);
        q.add(popped.right);
                i+=2;
        }
        }
        
       return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));