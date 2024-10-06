package A2409Sep2024.Class11;

import java.time.LocalDate;
import java.util.Calendar;

public class CombineTest5 {
    public static void main(String[] args) {
        //Test Feb has 28 days or not
        System.out.println();
        int year = 2001 ;


        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day =c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        LocalDate ld = LocalDate.of(year, 3, 1);
        ld=ld.minusDays(1);
        System.out.println(ld.getDayOfMonth());
    }
}
