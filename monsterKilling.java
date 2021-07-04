class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double time[]=new double[dist.length];
        for(int i=0;i<time.length;i++)
        {
            time[i]=(double)dist[i]/(double)speed[i];
           // System.out.print(time[i]+" ");
        }
        Arrays.sort(time);
        int timeKilling=0;
        int monster=0;
        for(int i=0;i<time.length;i++)
        {
           
            if(timeKilling>=time[i])
                return monster;
            timeKilling++;
            monster++;
                
        }
        return monster;
    }
}