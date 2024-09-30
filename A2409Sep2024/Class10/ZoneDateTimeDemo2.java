package A2409Sep2024.Class10;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ZoneDateTimeDemo2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Instant i = Instant.ofEpochMilli(0L);
        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime zdm1 = ZonedDateTime.ofInstant(i, zid);
        System.out.println(zdm1);

        ZonedDateTime zdm2 = zdm1.withYear(1995);
        System.out.println(zdm2);//1995
        
        ZonedDateTime zdm3 = zdm1.minusYears(5);
        System.out.println(zdm3);//1969-5

        ZonedDateTime zdm4 = zdm1.plusYears(2);
        System.out.println(zdm4);//1969+2

    }
}
