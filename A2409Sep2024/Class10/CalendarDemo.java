package A2409Sep2024.Class10;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        /*
        1. Calendar can't new, must use geInstance.
        2. Month 0-11 ==> means 0 is Jan(array put month)
        3. Week 1 - 7 ==> 1=Sunday.
         */
        System.out.println("Calender Demo:");
        Calendar c = Calendar.getInstance();
        System.out.println(c);//it's an array have all calendar info init[]

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month+1);
        System.out.println(dayOfMonth);
        System.out.println(getWeek(week));



    }


    public static String getWeek(int week){
        
        String [] allWeek = {"","11","22","33","44","55","66","77",};
        return allWeek[week];
    }
}
