class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int ans[]=new int[n];
        int count=0;
        for(int i=0;i<m;i++){
           int sec=arr2[i];
            for(int j=0;j<n;j++){
                if(sec==arr1[j])
                {
                    ans[count++]=sec;
                }
            }
        }
        
        //non matched ele
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele=arr1[i];
            boolean flag=false;
            for(int j=0;j<m;j++){
                if(ele==arr2[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
            a.add(arr1[i]);
            }
        }
        Collections.sort(a);
        for(int i:a)
            ans[count++]=i;
       return ans; 
    }
}