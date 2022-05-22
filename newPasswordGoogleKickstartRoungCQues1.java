import java.util.*;
    import java.io.*;
    public class Solution {
      public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
          int n = in.nextInt();
          String s=in.next();
          boolean isLower=false;
          boolean isUpper=false;
          boolean isSpecial=false;
          boolean isDigit=false;
          boolean isLength=false;
          StringBuffer sb=new StringBuffer(s);
          isLength=s.length()>=7?true:false;
          for(int i1=0;i1<n;i1++){
             int d=s.charAt(i1);
             char ch=s.charAt(i1);
             if(d>=97 && d<=122)
             isLower=true;
             if(d>=65 && d<=90)
             isUpper=true;
             if(ch=='#' || ch=='@' || ch=='&' ||ch=='*')
             isSpecial=true;
             if(Character.isDigit(ch))
             isDigit=true;
             
             
          }
          if(!isLower)
          sb.append("a");
          if(!isUpper)
          sb.append("A");
          if(!isDigit)
          sb.append("1");
          if(!isSpecial)
          sb.append("&");
          if(sb.toString().length()<7){
              int d=7-sb.toString().length();
              for(int i11=0;i11<d;i11++){
                  sb.append("1");
              }
          }
          String ans=sb.toString();
          System.out.println("Case #" + i + ": " +ans );
        }
      }
    }
  
