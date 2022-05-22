class Solution {
    public int minimumLines(int[][] stockPrices) {
       // HashMap<Integer,Integer>h=new HashMap<>();
        int n=stockPrices.length;
        if(n==1)
            return 0;
      int count=1;
        Comparator co=new Comparator<int[]>(){
        public int compare(int a[],int b[]){
              return a[0]-b[0];
         }
         };
        Arrays.sort(stockPrices,co);
        int previousX=stockPrices[1][0]-stockPrices[0][0];
        int previousY=stockPrices[1][1]-stockPrices[0][1];
        for(int i=1;i<n-1;i++){
            int nextX=stockPrices[i+1][0]-stockPrices[i][0];
            int nextY=stockPrices[i+1][1]-stockPrices[i][1];
            if((previousY*nextX)!=(previousX*nextY)){
                count++;
            }
                
            previousX=nextX;
            previousY=nextY;
        }
        return count;
       
            
            
            
     
    }
}