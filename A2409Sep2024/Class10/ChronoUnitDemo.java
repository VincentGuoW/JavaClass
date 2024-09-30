package A2409Sep2024.Class10;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(1995, 9, 1, 0, 0, 0);
        System.out.println(ldt);

        System.out.println(ChronoUnit.DAYS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.MINUTES.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.SECONDS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.MILLIS.between(ldt, LocalDateTime.now()));
    }
}
