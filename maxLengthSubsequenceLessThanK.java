class Solution {
    public int longestSubsequence(String s, int k) {
        int max=0;
        ArrayList<String> a=new ArrayList<>();
        call(a,0,s,"");
       for(String ss:a){
              if(ss.isEmpty())
                  continue;
                if(Integer.parseInt(ss,2)<=k)
                    max=Math.max(ss.length(),max);
            }
        
        return max;
    }
    
    public void call(ArrayList<String> a,int start,String s,String output){
        if(start>=s.length())
        {
            a.add(output);
            return;
        }
        call(a,start+1,s,output+s.charAt(start));
        call(a,start+1,s,output);
    }
}
------------------------------------------------------------------------------
class Solution {
    public int longestSubsequence(String s, int k) {
        int totalLength=0;
        int indexOfLastZero=0;
        //collect all zeroes
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
            {
                indexOfLastZero=i;
                totalLength++;
            }
        }
       // System.out.println(totalLength);
        //collect all ones
        int endingOnes=0;
        long sum=0;
        int p=0;
        int index=indexOfLastZero+1;
        while(index<s.length()){
            if((sum+(int)Math.pow(2,p))<=k){
              
                sum+=(int)Math.pow(2,p);
                  p++;
                endingOnes++;
                index++;
            }else
                break;
            
        }
        totalLength+=endingOnes;
        //now collect middle ones
        int bitPosition=endingOnes;
        for(int i=indexOfLastZero;i>=0;i--){
            if(s.charAt(i)=='0'){
               bitPosition++; 
            }else{ //if one present
                
                if((sum+(int)Math.pow(2,bitPosition))<=k){
                 System.out.println("sum :"+sum);
                    sum+=(int)Math.pow(2,bitPosition);
                     // System.out.println("sum :"+sum);
                       bitPosition++;
                    totalLength++;
                }else
                    break;
            }
        }
        return totalLength;
    }
}