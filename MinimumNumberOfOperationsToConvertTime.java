class Solution {
    public int convertTime(String current, String correct) {
        String curr[]=current.split(":");
        String cor[]=correct.split(":");
        int c1=Integer.parseInt(curr[0]);
        int c2=Integer.parseInt(curr[1]);
        int co1=Integer.parseInt(cor[0]);
        int co2=Integer.parseInt(cor[1]);
        int diff1=c1*60+c2;
        int diff2=co1*60+co2;
        int count=0;
        int totalmin=diff2-diff1;
        int mod=0;
          System.out.println("diff1 :"+diff1+"diff2 :"+diff2);
      
          
        
        System.out.println(totalmin);
        while(totalmin>0){
            if(totalmin>=60){
                 count=count+totalmin/60;
                totalmin=totalmin%60;
               
                //count++;
            }else if(totalmin>=15){
                   count=count+totalmin/15;
            totalmin=totalmin%15;
                //totalmin=totalmin/15;
             
        }
            else if(totalmin>=5){
                  count=count+totalmin/5;
            totalmin=totalmin%5;
                //totalmin=totalmin/5;
             
        }
            else if(totalmin>=1){
                 count=count+totalmin;
            totalmin=0;
                
              //  totalmin=totalmin/1;
                
        }
        }
        return count;
    }
}