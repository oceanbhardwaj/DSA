// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
      HashMap<Character,Integer> h=new HashMap<>();
      h.put('A',2);
      h.put('B',22);
      h.put('C',222);
      h.put('D',3);
      h.put('E',33);
      h.put('F',333);
      h.put('G',4);
      h.put('H',44);
      h.put('I',444);
      h.put('J',5);
      h.put('K',55);
      h.put('L',555);
      h.put('M',6);
      h.put('N',66);
      h.put('O',666);
      h.put('P',7);
      h.put('Q',77);
      h.put('R',777);
      h.put('T',8);
      h.put('U',88);
      h.put('V',888);
      h.put('W',9);
      h.put('X',99);
      h.put('Y',999);
      h.put('Z',9999);
      h.put(' ',0);
      h.put('S',7777);
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<S.length();i++){
          sb.append(h.get(S.charAt(i)));
      }
      return sb.toString();
      
    }
}