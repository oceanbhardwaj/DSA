class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return dfs(nums,0,nums.length-1);
        
    }
    public TreeNode dfs(int nums[],int start,int end)
    {
        if(start>end || end>=nums.length )
            return null;
       int mid=(int)(Math.ceil(start+end)/2);
        TreeNode c=new TreeNode(nums[mid]);
        c.left=dfs(nums,start,mid-1);
        c.right=dfs(nums,mid+1,end);
        return c;
    }
}