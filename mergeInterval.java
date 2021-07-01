class Solution {
    public int[][] merge(int[][] intervals){
        Comparator co=new Comparator<int[]>()
        {
           public int compare(int a[],int b[]){
               if(a[0]==b[0])
                   return a[1]-b[1];
               return a[0]-b[0];}
        
        };
        Arrays.sort(intervals,co);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int a=intervals[i][0];
            int b=intervals[i][1];
            if(end>=a)
            {
                end=Math.max(b,end);
            }
            else
            {
                ArrayList<Integer> a2=new ArrayList<>();
                a2.add(start);
                a2.add(end);
                res.add(a2);
                start=a;
                end=b;
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
                a.add(start);
                a.add(end);
                res.add(a);
        
        int size=res.size();
        int arr[][]=new int[size][2];
        int index=0;
        for(ArrayList<Integer> a1:res)
        {
   arr[index][0]=a1.get(0);
            arr[index++][1]=a1.get(1);
        }
        return arr;
        
    }
}