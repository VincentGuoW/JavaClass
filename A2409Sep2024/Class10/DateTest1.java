package A2409Sep2024.Class10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) throws ParseException {
        /*
        Birthday 2000-11-11 change to formate 2000 YEAR 11 MONTH 11 DAY 

         */

        String birthday = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf1.parse(birthday);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy 'YEAR' MM 'MONTH' dd 'DAY'");
        System.out.println(sdf2.format(birthdayDate));
    }
}
