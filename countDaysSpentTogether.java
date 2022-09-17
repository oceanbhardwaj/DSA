class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days=0;
        int daysOfAliceArrival=convert(arriveAlice);
        int daysOfAliceLeave=convert(leaveAlice);
        int daysOfbobArrival=convert(arriveBob);
        int daysOfbobLeave=convert(leaveBob);
        int d1=Math.max(daysOfAliceArrival,daysOfbobArrival);
        int d2=Math.min(daysOfAliceLeave,daysOfbobLeave);
        if(d1>d2)
            return 0;
        return d2-d1+1;
       
    }
    public int convert(String ans){
        int count=0;
        int a1=Integer.parseInt(ans.substring(0,2));
        int d1=Integer.parseInt(ans.substring(3));
        
        int arr[]={0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1;i<a1;i++)
        {
            count+=arr[i];
        }
        count+=d1;
        
        return count;
 
    }
}