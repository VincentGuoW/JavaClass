package A2409Sep2024.Class10;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println(i1);

        //Instant create
        Instant i2 =Instant.ofEpochMilli(1L);
        System.out.println(i2);
        Instant i3 =Instant.ofEpochSecond(1L);
        System.out.println(i3);
        Instant i4 =Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(i4);


        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt);

        Instant instant4 = Instant.ofEpochMilli(4L);
        Instant instant5 = Instant.ofEpochMilli(6L);
        boolean result1 = instant4.isAfter(instant5);
        boolean result2 = instant4.isBefore(instant5);
        System.out.println(result1);
        System.out.println(result2);
        Instant instant6 = instant5.minusMillis(1000L);
        Instant instant7 = instant5.plusMillis(1000L);
        System.out.println(instant5);
        System.out.println(instant6);
        System.out.println(instant7);

        
    }
}
