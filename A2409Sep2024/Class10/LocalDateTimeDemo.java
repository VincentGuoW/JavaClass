package A2409Sep2024.Class10;

import java.time.LocalDate;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate tmrDate = LocalDate.of(2024, 9, 30);
        System.out.println(tmrDate);                            //  2024-09-30
        System.out.println(tmrDate.getMonth());                 //  SEPTEMBER 
        System.out.println(tmrDate.getMonthValue());            //  9
        System.out.println(tmrDate.getMonth().getValue());      //  9

    }
}
