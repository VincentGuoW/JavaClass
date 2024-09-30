package A2409Sep2024.Class10;

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args) {
        /*
            set method==>
                c.set(Calendar.Month,12)==> month 0-11, if we SET to 12 it will
                jump to the next year.

            add method==>
                c.add(Calendar.Month,12)==> add month will add from current month
            add method==>
                c.add(Calendar.Month,-1)==> use negetive number for minus a month
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

        c.set(Calendar.YEAR, 123);
        int year2 = c.get(Calendar.YEAR);
        System.out.println(c);
        System.out.println(year2);

        c.add(Calendar.YEAR, 123);
        int year3 = c.get(Calendar.YEAR);
        System.out.println(c);
        System.out.println(year3);


    }


    public static String getWeek(int week){
        
        String [] allWeek = {"","11","22","33","44","55","66","77",};
        return allWeek[week];
    }
}
