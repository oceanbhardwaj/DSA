class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        HashMap<String,Integer> h=new HashMap<>();
        
        for(int a[]:rectangles){
            int x=a[0];
            int y=a[1];
            for(int b[]:points){

            int x1=b[0];
                int y1=b[1];
                if(x1<=x && y1<=y)
                {
                    String s=x1+"points"+y1;
                   // System.out.println("s :"+s);
                    //System.out.println("x :"+x +"y :"+y);
                    // System.out.println("x1 :"+x1 +"y1 :"+y1);
                    h.put(s,h.getOrDefault(s,0)+1);
                }
            
            }
        }
        int arr[]=new int[points.length];
        int count=0;
       for(int a[]:points){
           String s1=a[0]+"points"+a[1];
           if(!h.containsKey(s1))
               arr[count++]=0;
           else
           arr[count++]=h.get(s1);
       }
        return arr;
    }
}