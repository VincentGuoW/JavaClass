package A2409Sep2024.Class10;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
    public static void main(String[] args) {
        System.out.println();
        LocalDate ld1 = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 1, 1);
        Period beenDays = Period.between( birthday,ld1);
        System.out.println(beenDays.toTotalMonths());
    }
}
