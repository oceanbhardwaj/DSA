class Solution {
    public String getSmallestString(int n, int k) {
        char ch[]=new char[n];
        Arrays.fill(ch,'a');
        int index=n-1;
        k=k-n;
        while(k>0){
            if(k>=25){
                ch[index]='z';
                k-=25;
            }else{
                ch[index]=(char)(k+97);
                break;
            }
            index--;
            
        }
        return String.valueOf(ch);
    }
}