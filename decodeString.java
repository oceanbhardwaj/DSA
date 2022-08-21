class Solution {
    public String decodeString(String s) {
       Stack<String> str=new Stack<>();
       Stack<Integer> frequencyCount=new Stack<>();
       StringBuffer dummy=new StringBuffer();
       for(int i=0;i<s.length();){
           char ch=s.charAt(i);
           if(Character.isDigit(ch)){
               int digit=0;
               while(Character.isDigit(s.charAt(i))){
                   digit=digit*10+(Integer.parseInt(s.charAt(i)+""));
                   i++;
               }
               frequencyCount.push(digit);
           }else if(ch=='[')//just push
           {
               str.push(dummy.toString());
               dummy=new StringBuffer();
               i++;
           }else if(ch==']'){
               StringBuffer appendString=new StringBuffer(str.pop());
               int count=frequencyCount.pop();
               for(int j=0;j<count;j++){
                   appendString.append(dummy.toString());
               }
               dummy=new StringBuffer(appendString.toString());
               i++;
           }else{//character
               dummy.append(s.charAt(i));
               i++;
           }
       
       }
       return dummy.toString(); 
    }
}