class Solution {
    public int twoCitySchedCost(int[][] costs) {
   Comparator co=new Comparator<int[] >(){
       public int compare(int[]a,int[]b){
     return  Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]);}};
        Arrays.sort(costs,co);
        int countA=0;
        int countB=0;
        int n=costs.lengclass Solution {
    public int twoCitySchedCost(int[][] costs) {
   Comparator co=new Comparator<int[] >(){
       public int compare(int[]a,int[]b){
     return  Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1]);}};
        Arrays.sort(costs,co);
        int countA=0;
        int countB=0;
        int n=costs.length/2;
        int res=0;
     for(int  i=0;i<costs.length;i++)
         { if(countA<n && countB<n)
     { if(costs[i][0]<costs[i][1])
    { res+=costs[i][0];
     countA++;}
      else
          { res+=costs[i][1];
           countB++;}}
        else if(countA<n)
         { res+= costs[i][0];
          countA++;}
         else if(countB<n )
          { res+=costs[i][1];
           countB++;}}
          
          return res;
    }
}
        



   
          
      

