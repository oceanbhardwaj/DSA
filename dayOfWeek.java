import java.time.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
      /* LocalDate l=LocalDate.of(year,month,day);
        String ans=l.getDayOfWeek().toString().toLowerCase();
        return (ans.charAt(0)+"").toUpperCase()+ans.substring(1);
        */
        int d=4;
       int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String  week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for(int i=1971;i<year;i++){
            if(i%4==0 && (i%100!=0 || i%400==0))
                d+=366;
            else
                d+=365;
        }
        for(int i=0;i<month-1;i++){
            if(i==1 && ((year%4==0 && (year%100!=0 || year%400==0))))
                d+=29;
            else
                d+=m[i];
        }
        d+=day;
        return week[d%7];
    }
}