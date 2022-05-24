class Solution {
    public int strStr(String haystack, String needle) {
        //finding lps
        int n=needle.length();
        int lps[]=new int[n];
        call(lps,needle);
        System.out.println(Arrays.toString(lps));
        //KMP
        
        int j=0;
        for(int i=0;i<haystack.length();){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if(j==n)
                    return i-j;
            }else{
                if(j==0)
                    i++;
                else
                    j=lps[j-1];
            }
        }
        return -1;
        
        
        
        
        
        
    }
    public void call(int lps[],String s){
    int i=1;
        int n=s.length();
        int len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len==0)
                    i++;
                else
                    len=lps[len-1];
            }
}
    
    
    
    }
}