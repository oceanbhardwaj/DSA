class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s>end){ //not merging
                list.add(Arrays.asList(start,end));
                start=s;
                end=e;
            }else{//merging
                end=Math.max(e,end);
               // start=Math.min(s,start);
                
            }
        }
         list.add(Arrays.asList(start,end));
       int arr[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            arr[i][0]=list.get(i).get(0);
            arr[i][1]=list.get(i).get(1);
           
        }
        return arr;
    }
}