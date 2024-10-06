package A2409Sep2024.Class11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class CombineTest4 {
    public static void main(String[] args) throws ParseException {
        // how many days have you borned
        int year = 1995;
        int month = 6;
        int day = 10;

        String birthday = year + "-" + month +"-"+day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthday);
        System.out.println(birthdayDate.getTime());
        Long result = System.currentTimeMillis()-birthdayDate.getTime();
        Long days = result/60/60/24/1000;
        System.out.println(days);

        LocalDate bd = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        Long days2 = ChronoUnit.DAYS.between(bd, now);
        System.out.println(days2);

        Calendar bdCalender = Calendar.getInstance();
        bdCalender.set(Calendar.YEAR, year);
        bdCalender.set(Calendar.MONTH, month-1);
        bdCalender.set(Calendar.DAY_OF_MONTH, day);
        long bdCalenderMills = bdCalender.getTimeInMillis();
        Calendar nowCalender = Calendar.getInstance();
        long nowCalenderMills = nowCalender.getTimeInMillis();
        long resultCalender = nowCalenderMills- bdCalenderMills;
        System.out.println(resultCalender/60/60/24/1000); 


    }
}
