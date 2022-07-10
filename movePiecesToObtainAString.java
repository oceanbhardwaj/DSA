class Solution {
    public boolean canChange(String start, String target) {
        int indexS=0;
        int indexT=0;
        if(start.length()!=target.length())
            return false;
        
        while(indexS<start.length() || indexT<target.length()){
            while(indexS<start.length() && start.charAt(indexS)=='_')
               indexS++;
            while(indexT<target.length() && target.charAt(indexT)=='_')
                indexT++;
            
            //reach at end
            if(indexT==target.length() && indexS==start.length())
                return true;
            
            if(indexS==start.length() || indexT==target.length() || start.charAt(indexS)!=target.charAt(indexT))
                return false;
            
            if(start.charAt(indexS)=='L' && indexT>indexS)
                return false;
            if(target.charAt(indexT)=='R' && indexS>indexT)
                return false;
            indexS++;
            indexT++;
        }
        return true;
    }
}