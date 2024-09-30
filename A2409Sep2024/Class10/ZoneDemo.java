package A2409Sep2024.Class10;

import java.time.ZoneId;
import java.util.Set;

public class ZoneDemo {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneId2 = ZoneId.of("Europe/Tallinn");
        System.out.println(zoneId2);
    }
}
