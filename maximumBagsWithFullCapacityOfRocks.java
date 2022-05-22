class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans[][]=new int[capacity.length][2];
        int n=capacity.length;
        for(int i=0;i<n;i++){
           
                ans[i][0]=capacity[i];
                ans[i][1]=rocks[i];
            
        }
        System.out.println(Arrays.deepToString(ans));
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return (a[0]-b[0])-(a[1]-b[1]);
            }
        };
        Arrays.sort(ans,co);
        System.out.println(Arrays.deepToString(ans));
        int count=0;
        
        for(int a[]:ans){
            int r=a[1];
            int c=a[0];
            if(c==r)
                count++;
           else  if(c>r){
                int d=c-r;
                if(d<=additionalRocks){
                   if(r+d>=c)
                       count++;
                    additionalRocks-=d;
                }
            }
        }
        // for(int a[]:ans){
        //     if(a[0]==a[1])
        //         count++;
        // }
        // for(int i=0;i<capacity.length;i++){
        //     if(capacity[i]>rocks[i]){
        //         int d=capacity[i]-rocks[i];
        //         if(d<=additionalRocks){
        //             rocks[i]+=d;
        //             additionalRocks-=d;
        //         }
        //     }
        
//         int count=0;
//         for(int i=0;i<rocks.length;i++){
// if(capacity[i]<=rocks[i])
//             count++;
//         }
        return count;
    }
}