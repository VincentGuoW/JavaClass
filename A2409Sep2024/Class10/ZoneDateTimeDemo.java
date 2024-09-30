package A2409Sep2024.Class10;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZoneId zid= ZoneId.systemDefault();
        System.out.println(zid);

        ZonedDateTime zdt2 = ZonedDateTime.of(2013, 9, 11, 8, 0, 0, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt2);

        Instant i = Instant.ofEpochMilli(0L);
        ZonedDateTime zdt3 = ZonedDateTime.ofInstant(i, zid);
        System.out.println(zdt3);

        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        Instant i2 = Instant.now();
        ZonedDateTime zdt4 = ZonedDateTime.ofInstant(i2, shanghai);
        System.out.println(zdt4);
    }
}
