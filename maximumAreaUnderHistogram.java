class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int previousSmaller[]=new int[n];
        int nextSmaller[]=new int[n];
        Arrays.fill(previousSmaller,-1);
        Arrays.fill(nextSmaller,n);
        //finding previousSmaller
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++){
            if(!s.isEmpty()){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                    s.pop();
            }
            if(!s.isEmpty()){
                previousSmaller[i]=s.peek();
            }
            s.push(i);
                
        }
        //finding next smaller
        s=new Stack<>();
        s.push(heights.length-1);
        for(int i=heights.length-2;i>=0;i--){
            if(!s.isEmpty()){
                while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                    s.pop();
            }
             if(!s.isEmpty()){
                nextSmaller[i]=s.peek();
            }
            s.push(i);
            
        }
        System.out.println("previousElement :"+Arrays.toString(previousSmaller));
        System.out.println("nextSmaller :"+Arrays.toString(nextSmaller));
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,(nextSmaller[i]-previousSmaller[i]-1)*heights[i]);
        }
        return max;
    }
}