package A2409Sep2024.Class08;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        System.out.println();

        //Data() with nothing will return current time
        Date d = new Date();
        System.out.println(d);

        //Data(x) with something will return epoch time + x input
        //when input is long type, put L in the end
        Date d2 = new Date(0L);
        System.out.println(d2);

        Date d3 = new Date(1000L);
        System.out.println(d3);

        long time = d3.getTime();
        System.out.println(time);
    }
}
