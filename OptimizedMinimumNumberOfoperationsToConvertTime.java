class Solution {
    public int convertTime(String current, String correct) {
        String curr[]=current.split(":");
        String corr[]=correct.split(":");
        int c1=Integer.parseInt(curr[0]);
        int c2=Integer.parseInt(curr[1]);
        int c3=Integer.parseInt(corr[0]);
        int c4=Integer.parseInt(corr[1]);
        int diff=(c3*60+c4)-(c1*60+c2);
        return diff/60+(diff%60)/15+(diff%15)/5+diff%5;
    }
}