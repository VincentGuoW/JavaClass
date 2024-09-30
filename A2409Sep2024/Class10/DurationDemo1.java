package A2409Sep2024.Class10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationDemo1 {
    public static void main(String[] args) {
        System.out.println();
        LocalDateTime ld1 = LocalDateTime.of(1995, 9, 1, 0, 0, 0);
        LocalDateTime ld2 = LocalDateTime.now();
        Duration d = Duration.between(ld1,ld2);
        System.out.println(d);
        System.out.println(d.toDays());
    }
    
}
