class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter)
                count++;
        }
        return (int)(count*100)/n;
        
    }
}